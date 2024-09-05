package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @GetMapping("/title")
    public List<Task> getTasksByTitle(@RequestParam String title) {
        return service.getTasksByTitle(title);
    }

    @GetMapping("/status")
    public List<Task> getTasksByStatus(@RequestParam String status) {
        return service.getTasksByStatus(status);
    }
}
