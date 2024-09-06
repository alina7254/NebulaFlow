package com.notification.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class NotificationDTO {
    private Long id;
    private String title;
    private String message;
    private LocalDateTime timestamp;
}
