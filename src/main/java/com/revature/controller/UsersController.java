package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Users;
import com.revature.repos.UsersDAO;


@RestController
@RequestMapping("/users")
public class UsersController {
	
	private UsersDAO ud;
	
	
	@Autowired
	public UsersController(UsersDAO u) {
		this.ud = u;
	}
	

	
	@PostMapping("addUser.app")
	public void addUser(@RequestBody Users user) {
		ud.save(user);
	}
	
	@PostMapping("/findbyemail.app")
	public @ResponseBody Users findByEmail(@RequestBody Users user) {
		Users u = new Users();
		u = user;
		System.out.println(u.getEmail());
		return ud.findUsersByEmail(u.getEmail());
	}

}


//@GetMapping("/id.app")
//public @ResponseBody ConfusedClowns getById(){
//	return cd.findById(2);
//}