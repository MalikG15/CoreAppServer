package edu.lawrence.to;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import org.hibernate.annotations.GenericGenerator;;

/**
 * @author Malik Graham
 */
@Entity
@Table(name = "User")
public class User {
	  @Id
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  @GeneratedValue(generator = "uuid")
	  @Column(name = "userid")
	  private String userid;
	  @Column(name = "username")
	  private String username;
	  @Column(name = "password")
	  private String password;
	  @Column(name = "email")
	  private String email;
	  @Column(name = "administrator")
	  private int administrator;
	  	

	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
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
	public String getUserid() {
		return userid;
	}
	public void setUserId(String userid) {
		this.userid = userid;
	}
}
