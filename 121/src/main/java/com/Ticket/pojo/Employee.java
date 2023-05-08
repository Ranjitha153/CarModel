package com.Ticket.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="question")
public class Employee {
    
	@Id
	private int qno;
	private String qname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<address> ans;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<address> getAns() {
		return ans;
	}
	public void setAns(List<address> ans) {
		this.ans = ans;
	}
	
	
	
}
	