package com.pearl.user;

import com.pearl.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMasterApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	private final Logger logger = LoggerFactory.getLogger(UserMasterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserMasterApplication.class, args);
	}

	@SuppressWarnings("PlaceholderCountMatchesArgumentCount")
	@Override
	public void run(String...args) {

		logger.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.");
	}

}
