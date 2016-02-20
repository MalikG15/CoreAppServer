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

@RequestMapping("/core")
@RestController
public class UserRestController {
	
	@Autowired
	UserRepository userRepository;
	
	@ResponseBody
	@RequestMapping("/user")
	public String validateUser(@RequestParam Map<String, String> userInfo) {
		String[] username = (userInfo.keySet()).toArray(new String[0]);
		String[] password = (userInfo.values()).toArray(new String[0]);
		if (this.userRepository.findUsernameByUsernameAndPassword(username[0], password[0]) != null) {
			return this.userRepository.findUsernameByUsernameAndPassword(username[0], password[0]);
		}
	return null;
	}
	

}
