package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
   @PostMapping("/create")
   public ResponseEntity<User> create(@RequestBody User user){
       return userService.create(user);

   }

   @GetMapping("/getAll")
   public List<User> getAll(){
       return  userService.getAll();
   }

   @GetMapping("/getById/{id}")
    public Optional<User> getById(@PathVariable("id") UUID id){
       return userRepository.findById(id);
   }

}

