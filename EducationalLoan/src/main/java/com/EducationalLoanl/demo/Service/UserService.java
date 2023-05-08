package com.EducationalLoanl.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoanl.demo.Model.LoanApplicationModel;
import com.EducationalLoanl.demo.Model.UserModel;
import com.EducationalLoanl.demo.Repository.LoanApplicationModelRepository;
import com.EducationalLoanl.demo.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository urep;
	
	@Autowired
	LoanApplicationModelRepository lrep;
	
	public String ValidUser(String email,String password)
	{
		UserModel uobj=urep.findByEmail(email);
		if(uobj==null)
		{
			return "No user found";
		}
		else
		{
			if(uobj.getPassword().equals(password))
			{
				return "Login Successfully";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public UserModel newUser(UserModel obj)
	{
		return urep.save(obj);
	}
	public List<UserModel> getUserDetails()
	{
		return urep.findAll();
	}
	public LoanApplicationModel getLoan(int loanId)
	{
		LoanApplicationModel l=lrep.findById(loanId).get();
		return l;
	}
	public UserModel getProfile(int id)
	{
		UserModel u=urep.findById(id).get();
		return u;
	}

}
