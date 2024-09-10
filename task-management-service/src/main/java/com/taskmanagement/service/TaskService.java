package com.taskmanagement.service;

import com.taskmanagement.model.Task;
import com.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task createTask(Task task) {
        return repository.save(task);
    }

    public List<Task> getTasksByTitle(String title) {
        return repository.findByTitle(title);
    }

    public List<Task> getTasksByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Transactional
    public Task updateTask(Long id, Task task) {
        Optional<Task> existingTask = repository.findById(id);
        if (existingTask.isPresent()) {
            Task taskToUpdate = existingTask.get();
            taskToUpdate.setTitle(task.getTitle());
            taskToUpdate.setDescription(task.getDescription());
            taskToUpdate.setStatus(task.getStatus());
            return repository.save(taskToUpdate);
        } else {
            throw new RuntimeException("Task with id " + id + " not found");
        }
    }

    public void deleteTask(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Task with id " + id + " not found");
        }
    }

    public Task findTaskById(Long id) {
        Optional<Task> task = repository.findById(id);
        return task.orElse(null);
    }


    public boolean taskExists(Long id) {
        return repository.existsById(id);
    }
}


