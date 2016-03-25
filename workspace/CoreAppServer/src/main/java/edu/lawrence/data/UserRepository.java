package edu.lawrence.data;



import org.springframework.data.jpa.repository.JpaRepository;

import edu.lawrence.to.User;
/**
 * @author Malik Graham
 */

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsernameAndPassword(String username, String password);
	User findByUsername(String username);
	User findByPassword(String password);
	User findUsernameByUsername(String Username, String Password);
	User findByEmail(String email);
}
