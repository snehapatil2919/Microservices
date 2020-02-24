package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Monthly 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long custId;
	@NotBlank(message = "Customer name should not be blank")
	@Size (min = 1 , max = 15 , message = "Custmer name should be range of 1 to 15")
	private String customerName;
	private Date monthly_Date;
	private Long amount_monthly;
	private Long monthly_penalty;
	
	public Monthly() {
		// TODO Auto-generated constructor stub
	}

	public Monthly(Long id, Long custId, String customerName, Date monthly_Date, Long amount_monthly,
			Long monthly_penalty) {
		super();
		this.id = id;
		this.custId = custId;
		this.customerName = customerName;
		this.monthly_Date = monthly_Date;
		this.amount_monthly = amount_monthly;
		this.monthly_penalty = monthly_penalty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getMonthly_Date() {
		return monthly_Date;
	}

	public void setMonthly_Date(Date monthly_Date) {
		this.monthly_Date = monthly_Date;
	}

	public Long getAmount_monthly() {
		return amount_monthly;
	}

	public void setAmount_monthly(Long amount_monthly) {
		this.amount_monthly = amount_monthly;
	}

	public Long getMonthly_penalty() {
		return monthly_penalty;
	}

	public void setMonthly_penalty(Long monthly_penalty) {
		this.monthly_penalty = monthly_penalty;
	}

	@Override
	public String toString() {
		return "Monthly [id=" + id + ", custId=" + custId + ", customerName=" + customerName + ", monthly_Date="
				+ monthly_Date + ", amount_monthly=" + amount_monthly + ", monthly_penalty=" + monthly_penalty + "]";
	}
	
	
}
