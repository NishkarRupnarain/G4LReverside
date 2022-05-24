package com.g4l.Project_Simulation_Nishkar.controler;


import com.g4l.Project_Simulation_Nishkar.entity.User;
import com.g4l.Project_Simulation_Nishkar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.saveUsers(users);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return  userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/user/{name}")
    public User findUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }
}
