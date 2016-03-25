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
@Table(name = "Rating")
public class Rating {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "ratingid")
	private String ratingid;
	@Column(name = "user")
	private String user;
	
	public String getRatingid() {
		return ratingid;
	}
	public void setRatingid(String ratingid) {
		this.ratingid = ratingid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
