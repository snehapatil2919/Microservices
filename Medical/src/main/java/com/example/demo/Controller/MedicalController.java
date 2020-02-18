package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalController {

	@GetMapping("/medicalData")
	public String getData() {
		return "Hello these is Medical!...";
	}
}
