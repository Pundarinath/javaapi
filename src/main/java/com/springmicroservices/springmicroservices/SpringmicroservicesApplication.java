package com.springmicroservices.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringmicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmicroservicesApplication.class, args);
	}

	@RestController
	public class MyController {
		@GetMapping("/api/greeting")
		public String offerGreeting() {
			return new String("Good Day!");
		}

		@GetMapping("/api/getList")
		public String[] getList() {
			String[] x = new String[3];
			x[0] = "Good Morning!";
			x[1] = "Good Afternoon!";
			x[2] = "Good Night!";
			return x;
		}

		@GetMapping("/api/getSamples")
		public String getSamples() {
			String[] x = {"Good Morning!", "Good Afternoon!", "Good Night!"};
			return Arrays.stream(x).collect(Collectors.joining("; ")) + "; ";
		}
	}
}
