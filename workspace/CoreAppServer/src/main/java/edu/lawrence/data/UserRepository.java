package edu.lawrence.data;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.lawrence.to.User;
/**
 * @author Malik Graham
 */

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	User findByPassword(String password);
	String findIdByUsernameAndPassword(String Username, String Password);
	//String findIdByUsernameAndPassword()
}
