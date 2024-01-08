package com.example.Server.Controllers;

import com.example.Server.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Page")
public class Home {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/Home")
    public String goH0me() {
        return "Home Page.. ";
    }
}
