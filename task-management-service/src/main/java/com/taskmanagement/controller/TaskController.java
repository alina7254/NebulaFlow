package com.taskmanagement.controller;

import com.taskmanagement.dto.TaskDTO;
import com.taskmanagement.model.Task;
import com.taskmanagement.service.TaskService;
import org.springframework.web.bind.annotation.*;

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
    public List<TaskDTO> getAllTasks() {
        return service.getAllTasks().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping
    public TaskDTO createTask(@RequestBody TaskDTO taskDTO) {
        Task task = convertToEntity(taskDTO);
        Task savedTask = service.createTask(task);
        return convertToDTO(savedTask);
    }

    @GetMapping("/title")
    public List<TaskDTO> getTasksByTitle(@RequestParam String title) {
        return service.getTasksByTitle(title).stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @GetMapping("/status")
    public List<TaskDTO> getTasksByStatus(@RequestParam String status) {
        return service.getTasksByStatus(status).stream().map(this::convertToDTO).collect(Collectors.toList());
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
