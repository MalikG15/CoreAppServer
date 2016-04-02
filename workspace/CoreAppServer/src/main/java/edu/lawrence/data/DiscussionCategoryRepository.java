package edu.lawrence.data;

import edu.lawrence.to.DiscussionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Date;

/**
 * @author Malik Graham
 */
public interface DiscussionCategoryRepository extends JpaRepository<DiscussionCategory, Long> {
	DiscussionCategory findByDiscussionCategoryId(String discussioncategoryid);
	List<DiscussionCategory> findByCategoryLike(String category); 
	DiscussionCategory findByCategory(String category);
	List<DiscussionCategory> findAllOrderByDateDesc();
	List<DiscussionCategory> findAllOrderByCategoryDesc();
	List<DiscussionCategory> findByDateGreaterThanEqual(Date date);
	List<DiscussionCategory> findByDateLessThanEqual(Date date);
	List<DiscussionCategory> findAll();
}
