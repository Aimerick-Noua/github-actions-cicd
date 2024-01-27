package com.nous.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome Aimerick noua to CI/CD using github actions";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicdApplication.class, args);
	}

}
