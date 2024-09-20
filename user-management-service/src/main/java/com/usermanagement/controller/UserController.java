package com.usermanagement.controller;

import com.usermanagement.dto.UserDTO;
import com.usermanagement.model.User;
import com.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        User user = service.createUser(userDTO);
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }

    @GetMapping("/{username}")
    public UserDTO getUserByUsername(@PathVariable String username) {
        User user = service.findUserByUsername(username);
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
