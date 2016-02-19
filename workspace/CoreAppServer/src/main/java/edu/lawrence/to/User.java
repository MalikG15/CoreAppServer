package edu.lawrence.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Malik Graham
 */
@Entity
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  private String userName;
	  private String password;
	  private String email;
	  private int administrator;
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAdministrator() {
		return administrator;
	}
	public void setAdministrator(int administrator) {
		this.administrator = administrator;
	}
	  

}
