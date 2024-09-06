package com.taskmanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private String status;

}
