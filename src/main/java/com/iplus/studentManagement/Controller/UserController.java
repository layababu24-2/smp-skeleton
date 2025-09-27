package com.iplus.studentManagement.Controller;

import com.iplus.studentManagement.Entity.User;
import com.iplus.studentManagement.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Signup
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

    // Login (basic)
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        Optional<User> existingUser = this.userService.findByUsername(user.getUsername());
        if (existingUser.isPresent() && existingUser.get().getPassword().equals(user.getPassword())) {
            return "Login successful as " + existingUser.get().getRole();
        } else {
            return "Invalid username or password";
        }
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
}