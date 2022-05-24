package com.g4l.Project_Simulation_Nishkar.repository;

import com.g4l.Project_Simulation_Nishkar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    User findByName(String name);
}