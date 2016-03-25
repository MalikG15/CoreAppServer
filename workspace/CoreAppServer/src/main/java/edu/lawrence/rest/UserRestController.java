package edu.lawrence.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.lawrence.data.UserRepository;
import edu.lawrence.to.User;

/**
 * @author Malik Graham
 */

@RequestMapping("/user")
@RestController
public class UserRestController {
	
	@Autowired
	UserRepository userRepository;
	 
	@ResponseBody
	@RequestMapping("/checkuser")
	public String validateUser(@RequestParam("username") String username, @RequestParam("password") String password) {
		User checkUser = this.userRepository.findByUsernameAndPassword(username, password);
		if (checkUser != null) {
			return checkUser.getUserid();
		}
		return null;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/newuser", method = RequestMethod.POST)
	public String createNewUser(@RequestBody User user) {
		if (this.userRepository.findByEmail(user.getEmail()) != null) {
			throw new RuntimeException("There is already an account with this email");
		}
		else if (this.userRepository.findByUsername(user.getUserName()) != null) {
			throw new RuntimeException("There is already an account with this username");
		}
		else {
			this.userRepository.saveAndFlush(user);
			return user.getUserid();
		}
	}
	
	// RoleAuthorities.xml - where I define certain roles for specific users
	// Spring Security 
	// Never write a clear password to the database
}
