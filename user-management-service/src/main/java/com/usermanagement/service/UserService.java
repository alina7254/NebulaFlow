package com.usermanagement.service;

import com.usermanagement.dto.UserDTO;
import com.usermanagement.model.User;
import com.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(), userDTO.getPassword(), userDTO.getEmail());
        return repository.save(user);
    }

    public User findUserByUsername(String username) {
        return repository.findByUsername(username);
    }
}


