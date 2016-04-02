package edu.lawrence.to;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import org.hibernate.annotations.GenericGenerator;
import java.util.Date;

/**
 * @author Malik Graham
 */
@Entity
@Table(name = "DiscussionCategory")
public class DiscussionCategory {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "discussioncategoryid")
	private String discussioncategoryid;
	@Column(name = "userid")
	private String userid;
	@Column(name = "category")
	private String category;
	@Column(name = "date")
	private Date date;
	
	public String getDiscussioncategoryid() {
		return discussioncategoryid;
	}
	public void setDiscussioncategoryid(String discussioncategoryid) {
		this.discussioncategoryid = discussioncategoryid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}
