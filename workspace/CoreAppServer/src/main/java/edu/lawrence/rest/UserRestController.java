package edu.lawrence.rest;

import java.util.List;
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
	@RequestMapping("/username")
	public List<User> getUser(@RequestParam(value="username") String username) {
		return this.userRepository.findByUsername(username);
	}

}
