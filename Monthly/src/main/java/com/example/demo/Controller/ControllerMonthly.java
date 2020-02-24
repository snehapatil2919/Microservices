package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Monthly;
import com.example.demo.service.MonthlyService;
@RestController
public class ControllerMonthly 
{
	@Autowired
	MonthlyService monthlyService; 

	@PostMapping(value = "/saveData", headers = "Accept=application/json" )
	public ResponseEntity<Monthly> SaveData(@Valid @RequestBody Monthly monthly)
	{
		return new ResponseEntity<Monthly>(monthlyService.SaveAllData(monthly),HttpStatus.ACCEPTED);
	}
	@GetMapping(value = "/readData" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Monthly>> getAllDetails()
	{
		return new ResponseEntity<List<Monthly>>(monthlyService.findData(),HttpStatus.FOUND);
	}
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Monthly> updateAllData(@RequestBody Monthly monthly)
	{
		return new ResponseEntity<Monthly>(monthlyService.updateData(monthly),HttpStatus.IM_USED);
	}
	@DeleteMapping(value = "/deleteData" , headers = "Accept=application/json")
	public ResponseEntity<Void> deleteData(@PathVariable("id") Long id)
	{
		monthlyService.DeleteData(id);
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}
	@GetMapping(value = "/read/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Monthly>> getOne(@PathVariable("id") Long id)
	{
		return new ResponseEntity<Optional<Monthly>>(monthlyService.getData(id),HttpStatus.CONTINUE);
	}
}
