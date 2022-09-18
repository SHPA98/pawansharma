package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.myapp.Respositiry_dao.UserRepository;
import com.myapp.entities.User;

@SpringBootApplication
public class PolicyGroupApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PolicyGroupApplication.class, args);

		UserRepository userrepository = context.getBean(UserRepository.class);

		User user = new User();

		user.setName("pawan");
		user.setCity("kolkata");

		User user1 = userrepository.save(user);
		System.out.println(user1);

	}

}