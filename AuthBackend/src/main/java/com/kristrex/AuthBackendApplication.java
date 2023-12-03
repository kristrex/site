package com.kristrex;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.kristrex.models.ApplicationUser;
import com.kristrex.models.Role;
import com.kristrex.repository.RoleRepository;
import com.kristrex.repository.UserRepository;

@SpringBootApplication
public class AuthBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthBackendApplication.class, args);
	}
	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncode){
		return args -> {
			if(roleRepository.findByAuthority("ADMIN").isPresent()) return;//чтобы не делать перезапись
			Role adminRole = roleRepository.save(new Role("ADMIN"));
			roleRepository.save(new Role("USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			ApplicationUser admin = new ApplicationUser(1, "admin", passwordEncode.encode("password"), roles);
			
			userRepository.save(admin);
		};
	}
}
