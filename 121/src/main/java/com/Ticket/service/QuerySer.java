package com.Ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.Ticket.repository.QueryRepo;

import jakarta.transaction.Transactional;

@Service
public class QuerySer {
	@Autowired
	QueryRepo qrep;

	public List<Query> fetchQueryByNamePrefix(String prefix)
	{
		  return qrep.findByNameStartingWith(prefix);
	}
	public List<Query> fetchQueryByNameSuffix(String suffix)
	{
		  return qrep.findByNameEndingWith(suffix);
	}
	public List<Query> getQueryByDept(String dept)
	{
		  return qrep.findByDept(dept);
		  
	}

	@Transactional
	public int deleteQueryByName(String name)
	{
		return qrep.deletequeryByName(name);
		
	}
	@Transactional
	public int updateQuery(String dept,String name)
	{
		return qrep.updatequery(dept, name);
	}
}