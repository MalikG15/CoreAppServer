package edu.lawrence.rest;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	@RequestMapping("/user")
	public User validateUser(@RequestParam Map<String, String> userInfo) {
		String[] username = (userInfo.keySet()).toArray(new String[0]);
		String[] password = (userInfo.values()).toArray(new String[0]);
		User checkUser = this.userRepository.findByUsernameAndPassword(username[0], password[0]);
		if (checkUser != null) {
			return checkUser;
		}
	return null;
	}
	
	//@RequestMapping("/user/{newuser}")
	

}
