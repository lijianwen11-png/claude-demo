package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> list() {
        return userService.listAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping
    public int create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.modify(user);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id) {
        return userService.removeById(id);
    }
}
