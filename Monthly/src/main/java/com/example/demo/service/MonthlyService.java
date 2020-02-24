package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MonthlyDaoInterface;
import com.example.demo.model.Monthly;
@Service
public class MonthlyService 
{
	@Autowired
	MonthlyDaoInterface daoInterface;
	@Transactional
	public Monthly SaveAllData(Monthly monthly)
	{
		return daoInterface.save(monthly);
	}
	@Transactional
	public List<Monthly> findData()
	{
		return daoInterface.findAll();
	}
	@Transactional
	public Monthly updateData(Monthly monthly)
	{
		return daoInterface.save(monthly);
	}
	@Transactional
	public void DeleteData(Long id) 
	{
		daoInterface.deleteById(id);	
	}
	@Transactional
	public Optional<Monthly> getData(Long id)
	{
		return daoInterface.findById(id);
		
	}

}


