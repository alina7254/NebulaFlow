package com.example.notification.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationDTO {
    private Long id;
    private String title;
    private String message;
    private String recipient;


}
