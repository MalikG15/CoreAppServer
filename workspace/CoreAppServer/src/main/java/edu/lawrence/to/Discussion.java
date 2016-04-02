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
@Table(name = "Discussion")
public class Discussion {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "discussionid")
	private String discussionid;
	@Column(name = "author")
	private String author;
	@Column(name = "title")
	private String title;
	@Column(name = "body")
	private String body;
	@Column(name = "discussioncategoryid")
	private String discussioncategoryid;
	@Column(name = "date")
	private Date date;
	@Column(name = "rating")
	private String rating;
	
	public String getDiscussionid() {
		return discussionid;
	}
	public void setDiscussionid(String discussionid) {
		this.discussionid = discussionid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getDiscussioncategoryid() {
		return discussioncategoryid;
	}
	public void setDiscussioncategoryid(String discussioncategoryid) {
		this.discussioncategoryid = discussioncategoryid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
