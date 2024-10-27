package com.example.Spring.Controllers;

import com.example.Spring.Services.UserService;
import com.example.Spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired

    private UserService userService;

    // http://localhost:8081/home/users
    @GetMapping("/users")

    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }
}
