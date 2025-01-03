package danilobarreto.dev.testejava.controller;

import danilobarreto.dev.testejava.model.User;
import danilobarreto.dev.testejava.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @GetMapping("/list")
    public List<User> getAllUsers() { return userService.findAll(); }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) { return userService.createUser(user); }


    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) { return userService.updateUser(id, user); }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) { userService.deleteUser(id); }


}
