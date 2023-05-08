package com.Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface QueryRepo extends JpaRepository<Query,Integer> {
	List <Query>findByNameStartingWith(String prefix);
	   
	List <Query>findByDept(String dept);
    List <Query>findByNameEndingWith(String suffix);
    
    @Modifying
	@Query("delete from query s where s.name=?1")
    public int deletequeryByName(String name);

    
    @Modifying
    @Query("update query s set s.dept=?1 where s.name=?2 ")
    int updatequery(String dept,String name);
}
