package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "Doctor's first name should not be empty!...")
	@Size(min = 1 , max = 30 , message = "First name of a doctor should be in the range of 1-30..")
	private String doctorFirstName;
	@NotBlank(message = "Doctor's first name should not be empty!...")
	@Size(min = 1 , max = 30 , message = "Last name of a doctor should be in the range of 1-30..")
	private String doctorLastName;
	@NotBlank(message = "Doctor's first name should not be empty!...")
	@Size(min = 1 , max = 30 , message = "Designation of a doctor should be in the range of 1-30..")
	private String doctorsDesignation;
	private float doctorsTimeFrom;
	private float doctorsTimeTo;
	private int doctorsAppointments;
	private double doctorsCharges;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(
			@NotBlank(message = "Doctor's first name should not be empty!...") @Size(min = 1, max = 30, message = "First name of a doctor should be in the range of 1-30..") String doctorFirstName,
			@NotBlank(message = "Doctor's first name should not be empty!...") @Size(min = 1, max = 30, message = "Last name of a doctor should be in the range of 1-30..") String doctorLastName,
			@NotBlank(message = "Doctor's first name should not be empty!...") @Size(min = 1, max = 30, message = "Designation of a doctor should be in the range of 1-30..") String doctorsDesignation,
			float doctorsTimeFrom, float doctorsTimeTo, int doctorsAppointments, double doctorsCharges) {
		super();
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.doctorsDesignation = doctorsDesignation;
		this.doctorsTimeFrom = doctorsTimeFrom;
		this.doctorsTimeTo = doctorsTimeTo;
		this.doctorsAppointments = doctorsAppointments;
		this.doctorsCharges = doctorsCharges;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorFirstName() {
		return doctorFirstName;
	}

	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}

	public String getDoctorLastName() {
		return doctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	public String getDoctorsDesignation() {
		return doctorsDesignation;
	}

	public void setDoctorsDesignation(String doctorsDesignation) {
		this.doctorsDesignation = doctorsDesignation;
	}

	public float getDoctorsTimeFrom() {
		return doctorsTimeFrom;
	}

	public void setDoctorsTimeFrom(float doctorsTimeFrom) {
		this.doctorsTimeFrom = doctorsTimeFrom;
	}

	public float getDoctorsTimeTo() {
		return doctorsTimeTo;
	}

	public void setDoctorsTimeTo(float doctorsTimeTo) {
		this.doctorsTimeTo = doctorsTimeTo;
	}

	public int getDoctorsAppointments() {
		return doctorsAppointments;
	}

	public void setDoctorsAppointments(int doctorsAppointments) {
		this.doctorsAppointments = doctorsAppointments;
	}

	public double getDoctorsCharges() {
		return doctorsCharges;
	}

	public void setDoctorsCharges(double doctorsCharges) {
		this.doctorsCharges = doctorsCharges;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorFirstName=" + doctorFirstName + ", doctorLastName=" + doctorLastName
				+ ", doctorsDesignation=" + doctorsDesignation + ", doctorsTimeFrom=" + doctorsTimeFrom
				+ ", doctorsTimeTo=" + doctorsTimeTo + ", doctorsAppointments=" + doctorsAppointments
				+ ", doctorsCharges=" + doctorsCharges + "]";
	}
	
}
