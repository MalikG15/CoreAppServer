package edu.lawrence.to;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import org.hibernate.annotations.GenericGenerator;
import java.util.Date;

@Entity
@Table(name = "Comment")
public class Comment {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "commentid")
	private String commentid;
	@Column(name = "author")
	private String author;
	@Column(name = "discussionid")
	private String discussionid;
	@Column(name = "body")
	private String body;
	@Column(name = "parent")
	private String parent;
	@Column(name = "date")
	private Date date;
	
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDiscussionid() {
		return discussionid;
	}
	public void setDiscussionid(String discussionid) {
		this.discussionid = discussionid;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


}
