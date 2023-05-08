package com.Ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ticket.pojo.Employee;
import com.Ticket.repository.EmployeeRepo;


@RestController
@RequestMapping("/question")
public class Employeecontro {

	
	@Autowired
	EmployeeRepo qrepo;
	@PostMapping("")
	public String saveDetails(@RequestBody Employee q)
	{
		qrepo.save(q);
		return "Data is Saved";
	}
	@GetMapping("")
	public List<Employee> getDetails()
	{
		return qrepo.findAll();
	}
	
	@PutMapping("")
	public String updateDetails(@RequestBody Employee qu)
	{
		qrepo.saveAndFlush(qu);
		return "Data Updated";
		 
	}
	
	@DeleteMapping("/{qno}")
	public String deleteDetails(@PathVariable int qno)
	{
		qrepo.deleteById(qno);
		return "qno "+qno+"is deleted"; 
	}
}