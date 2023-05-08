package com.Ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ticket.pojo.address;


@Repository
public interface AddressRepo extends JpaRepository<address, Long>{

}
