package com.carlos05.course.resources;

import com.carlos05.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Carlos", "carlos@email.com", "91993116228", "senha123");
        return ResponseEntity.ok().body(user);
    }
}
