package com.taskmanagement.controller;

import com.taskmanagement.dto.TaskDTO;
import com.taskmanagement.model.Task;
import com.taskmanagement.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TaskDTO>> getAllTasks() {
        List<TaskDTO> tasks = service.getAllTasks()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public ResponseEntity<TaskDTO> createTask(@Valid @RequestBody TaskDTO taskDTO) {
        Task task = convertToEntity(taskDTO);
        Task savedTask = service.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(convertToDTO(savedTask));
    }

    @GetMapping("/title")
    public ResponseEntity<List<TaskDTO>> getTasksByTitle(@RequestParam String title) {
        List<TaskDTO> tasks = service.getTasksByTitle(title)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/status")
    public ResponseEntity<List<TaskDTO>> getTasksByStatus(@RequestParam String status) {
        List<TaskDTO> tasks = service.getTasksByStatus(status)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(tasks);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskDTO> updateTask(@PathVariable Long id, @Valid @RequestBody TaskDTO taskDTO) {
        Task existingTask = service.findTaskById(id);
        if (existingTask == null) {
            return ResponseEntity.notFound().build();
        }
        Task updatedTask = service.updateTask(id, convertToEntity(taskDTO));
        return ResponseEntity.ok(convertToDTO(updatedTask));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

    private TaskDTO convertToDTO(Task task) {
        TaskDTO dto = new TaskDTO();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        return dto;
    }

    private Task convertToEntity(TaskDTO dto) {
        Task task = new Task();
        task.setId(dto.getId());
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());
        return task;
    }
}
