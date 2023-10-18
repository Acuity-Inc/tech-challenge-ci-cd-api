package com.myacuity.techchallengecicdapi.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivelinessController {
	@GetMapping("/ping")
	public ResponseEntity<String> liveliness() {
		return ResponseEntity.ok("Hello from Acuity!");
	}
}
