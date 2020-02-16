package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Doctor;
import com.example.demo.Repository.DoctorDao;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao doctorDao;
	
	public Doctor saveDoctor(Doctor doctor) {
		Doctor doctorSave = doctorDao.save(doctor);
		return doctorSave;
	}

}
