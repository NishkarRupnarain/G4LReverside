package com.g4l.Project_Simulation_Nishkar.service;


import com.g4l.Project_Simulation_Nishkar.entity.User;
import com.g4l.Project_Simulation_Nishkar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User getUserByName(String name){
        return userRepository.findByName(name);
    }

    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "User deleted!! iduser: " + id;
    }

    public User updateUser(User user){
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getFirstName());
        existingUser.setIdNumber(user.getIdNumber());
        existingUser.setEmail(user.getEmail());
        existingUser.setUsername(user.getUsername());
        existingUser.setMobileNumber(user.getMobileNumber());
        existingUser.setPassword(user.getPassword());
        return userRepository.save(existingUser);
    }
}
