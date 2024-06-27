package com.example.demo;

import com.example.demo.Entities.Prof;
import com.example.demo.security.entities.Role;
import com.example.demo.security.services.AccountService;
import com.example.demo.security.services.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public CommandLineRunner fillTables(RoleService roleService, AccountService accountService) {
		return args -> {
			System.out.println("roles adding");
			Role roleEmploye = new Role("PROFFESOR");
			Role  roleManager = new Role("STUDENT");
			roleService.saveRole(roleEmploye);
			roleService.saveRole(roleManager);
			//leavetypes


		};
	}

}
