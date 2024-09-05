package com.notification.service;

import com.notification.model.Notification;
import com.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public Notification createNotification(Notification notification) {
        return repository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return repository.findAll();
    }

    public Optional<Notification> getNotificationById(Long id) {
        return repository.findById(id);
    }

    public Notification updateNotification(Long id, Notification updatedNotification) {
        return repository.findById(id)
                .map(notification -> {
                    notification.setTitle(updatedNotification.getTitle());
                    notification.setMessage(updatedNotification.getMessage());
                    notification.setTimestamp(updatedNotification.getTimestamp());
                    return repository.save(notification);
                })
                .orElseGet(() -> {
                    updatedNotification.setId(id);
                    return repository.save(updatedNotification);
                });
    }

    public void deleteNotification(Long id) {
        repository.deleteById(id);
    }
}
