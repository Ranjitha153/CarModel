package com.Ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ticket.pojo.Employee;
@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}