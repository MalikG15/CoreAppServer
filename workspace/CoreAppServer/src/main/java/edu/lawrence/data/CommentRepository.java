package edu.lawrence.data;

import edu.lawrence.to.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Date;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	Comment findById(String commentid);
	List<Comment> findByDiscussion(String discussionid);
	List<Comment> findByAuthor(String userid);
	List<Comment> findByDiscussionAndDateGreaterThanEqual(String discussionid, Date date);
	List<Comment> findByDiscussionAndDateLessThanEqual(String discussionid, Date date);
}
