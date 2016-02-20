package edu.lawrence.data;



import org.springframework.data.jpa.repository.JpaRepository;

import edu.lawrence.to.User;
/**
 * @author Malik Graham
 */

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	User findByPassword(String password);
	String findUsernameByUsernameAndPassword(String Username, String Password);
	User findByUsernameAndPassword(String Username, String Password);
}
