package com.notification.controller;

import com.notification.dto.NotificationDTO;
import com.notification.model.Notification;
import com.notification.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @GetMapping
    public List<NotificationDTO> getAllNotifications() {
        return service.getAllNotifications().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping
    public NotificationDTO createNotification(@RequestBody NotificationDTO notificationDTO) {
        Notification notification = convertToEntity(notificationDTO);
        Notification savedNotification = service.createNotification(notification);
        return convertToDTO(savedNotification);
    }

    @GetMapping("/type")
    public List<NotificationDTO> getNotificationsByType(@RequestParam String type) {
        return service.getNotificationsByType(type).stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @GetMapping("/timestamp")
    public List<NotificationDTO> getNotificationsByTimestamp(@RequestParam LocalDateTime timestamp) {
        return service.getNotificationsByTimestamp(timestamp).stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<NotificationDTO> getNotificationById(@PathVariable Long id) {
        Optional<Notification> notification = service.getNotificationById(id);
        return notification.map(this::convertToDTO);
    }

    private NotificationDTO convertToDTO(Notification notification) {
        NotificationDTO dto = new NotificationDTO();
        dto.setId(notification.getId());
        dto.setTitle(notification.getTitle());
        dto.setMessage(notification.getMessage());
        dto.setTimestamp(notification.getTimestamp());
        return dto;
    }

    private Notification convertToEntity(NotificationDTO dto) {
        Notification notification = new Notification();
        notification.setId(dto.getId());
        notification.setTitle(dto.getTitle());
        notification.setMessage(dto.getMessage());
        notification.setTimestamp(dto.getTimestamp());
        return notification;
    }
}

