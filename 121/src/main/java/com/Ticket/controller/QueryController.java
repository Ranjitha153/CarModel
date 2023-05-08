package com.Ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ticket.pojo.Query;
import com.Ticket.service.QuerySer;
@RestController
public class QueryController {
	@Autowired
	QuerySer qserv;
	
	@GetMapping("/Prefix")
	public List<Query> fetchQueryByNamePrefix(@RequestParam String prefix)
	{
		return qserv.fetchQueryByNamePrefix(prefix);
	}
	@GetMapping("/fetchStudentByNameSuffix")
	public List<Query>fetchQueryByNameSuffix(@RequestParam String suffix)
	{
		return qserv.fetchQueryByNameSuffix(suffix);
	}
	@GetMapping("/getStudentByDepartment/{department}/{name}")
	public List<Query>fetchQueryByDepartment(@PathVariable String dept)
	{
		return qserv.getQueryByD(dept);
	}
	@DeleteMapping("/deletebyquery/{name}")
	public String deleteQueryByName(@PathVariable("name") String name)
	{
		int result=qserv.deleteQueryByName(name);
		if(result>0)
			return "Query record deleted";
		else
			return "Problem occured while deleting";
	}
	@PutMapping("/updatebyquery/{dept}/{name}")
	public String updateQuery(@PathVariable ("dept")String dept,@PathVariable ("name")String name)
	{
		int result= qserv.updateQuery(dept,name);
		if(result>0)
			return "Student record updated";
		else
			return "Problem occured while updating";
		
		
	}
}