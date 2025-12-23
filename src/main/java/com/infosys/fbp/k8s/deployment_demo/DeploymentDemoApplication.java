package com.infosys.fbp.k8s.deployment_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class DeploymentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentDemoApplication.class, args);
	}

	@GetMapping("/ping")
	public ResponseEntity<String> getPing() {
		return ResponseEntity.ok("Success from Deployment Demo");
	}

}
