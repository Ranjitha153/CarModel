package com.EducationalLoanl.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoanl.demo.Model.LoanApplicationModel;
import com.EducationalLoanl.demo.Model.LoginModel;
import com.EducationalLoanl.demo.Model.UserModel;
import com.EducationalLoanl.demo.Service.LoanApplicationModelService;
import com.EducationalLoanl.demo.Service.UserService;


@RestController
public class UserController {
	@Autowired
	UserService userv;
	@Autowired
	LoanApplicationModelService lserv;
	@GetMapping("/fetch")
	public List<UserModel> getUserDetails()
	{
		return userv.getUserDetails();
	}
	@PostMapping("/userlogin")
	public String validateUser(@RequestBody LoginModel lmobj)
	{
		return userv.ValidUser(lmobj.getEmail(), lmobj.getPassword());
	}
	@PostMapping("/usersignup")
	public UserModel newUser(@RequestBody UserModel uobj)
	{
		return userv.newUser(uobj);
	}
	@GetMapping("/getloan/{loanId}")
	public LoanApplicationModel getLoan(@PathVariable int loanId)
	{
		return userv.getLoan(loanId);
	}
	@GetMapping("/getprofile/{id}")
	public UserModel getProfile(@PathVariable int id)
	{
		return userv.getProfile(id);
	}
	

}
