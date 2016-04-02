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
	private String userid;
	@Column(name = "discussion")
	private String discussionid;
	@Column(name = "discussioncategory")
	private String discussioncategoryid;
	@Column(name = "comment")
	private String commentid;
	
	public String getRatingid() {
		return ratingid;
	}
	public void setRatingid(String ratingid) {
		this.ratingid = ratingid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getDiscussionid() {
		return discussionid;
	}
	public void setDiscussionid(String discussionid) {
		this.discussionid = discussionid;
	}
	public String getDiscussioncategoryid() {
		return discussioncategoryid;
	}
	public void setDiscussioncategoryid(String discussioncategoryid) {
		this.discussioncategoryid = discussioncategoryid;
	}
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}

}
