package com.notification.service;

import com.notification.model.Notification;
import com.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class NotificationService {
    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }


    public List<Notification> getAllNotifications() {
        return repository.findAll();
    }

    public Notification createNotification(Notification notification) {
        return repository.save(notification);
    }

    public List<Notification> getNotificationsByType(String type) {
        return repository.findByType(type);
    }

    public List<Notification> getNotificationsByTimestamp(LocalDateTime timestamp) {
        return repository.findByTimestamp(timestamp);
    }


    public Optional<Notification> getNotificationById(Long id) {
        return repository.findById(id);
    }

}
