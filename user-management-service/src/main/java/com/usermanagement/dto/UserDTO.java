package com.usermanagement.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String username;
    private String email;
}
