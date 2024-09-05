package com.usermanagement.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Setter
public class UserDTO {
    private Long id;
    @Getter
    private String username;
    @Getter
    private String email;


}
