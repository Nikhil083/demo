package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

   @PostMapping("/")
   public User create(@RequestBody User user){
       return userService.create(user).getBody();

   }

   @GetMapping("/getAll")
   public List<User> get(){
       return  userService.getAll();
   }

}

