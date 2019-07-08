package com.edureka.userms.resource;

import com.edureka.userms.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(userService.getALUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity getSingleUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getSingleUser(id));
    }
}
