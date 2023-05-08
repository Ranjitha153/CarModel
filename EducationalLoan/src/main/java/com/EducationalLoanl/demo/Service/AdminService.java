package com.EducationalLoanl.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoanl.demo.Model.LoanApplicationModel;
import com.EducationalLoanl.demo.Repository.LoanApplicationModelRepository;

@Service
public class AdminService {
	@Autowired
	LoanApplicationModelRepository lorep;
	public List<LoanApplicationModel> getAdmin()
	{
		return lorep.findAll();
	}
 
	public LoanApplicationModel saveDetails(LoanApplicationModel lobj)
	{
		return lorep.save(lobj);
	}
}
