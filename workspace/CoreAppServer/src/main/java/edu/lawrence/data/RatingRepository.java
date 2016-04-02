package edu.lawrence.data;

import edu.lawrence.to.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Malik Graham
 */
public interface RatingRepository extends JpaRepository<Rating, Long> {
	
	Long countByDiscussionId(String discussionid);
	Long countByDiscussionCategoryId(String discussioncategoryid);
	Long countByCommentId(String commentid);
		
}
