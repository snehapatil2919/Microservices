package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Doctor;
import com.example.demo.Service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	public ResponseEntity<Doctor> saveDoctorInfo(Doctor doctor) {
		Doctor saveDoctor = doctorService.saveDoctor(doctor);
		return new ResponseEntity<Doctor>(saveDoctor, HttpStatus.ACCEPTED);
	}
}
