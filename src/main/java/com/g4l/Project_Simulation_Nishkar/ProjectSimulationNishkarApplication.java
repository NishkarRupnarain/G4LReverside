package com.g4l.Project_Simulation_Nishkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class})
public class ProjectSimulationNishkarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSimulationNishkarApplication.class, args);
    }

}
