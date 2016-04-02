package edu.lawrence.data;

import edu.lawrence.to.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Date;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
	Discussion findById(String discussionid);
	List<Discussion> findAll();
	List<Discussion> findByTitleContaining(String title);
	List<Discussion> findByCategoryAndTitleContaining(String discussioncategoryid, String title);
	List<Discussion> findByCategory(String discussioncategoryid);
	List<Discussion> findByDateGreaterThanEqual(Date date);
	List<Discussion> findByCategoryAndDateGreaterThanEqual(String discussioncategoryid, Date date);
	List<Discussion> findByDateLessThanEqual(Date date);
	List<Discussion> findByCategoryAndDateLessThanEqual(String discussioncategoryid, Date date);
	List<Discussion> findAllOrderByDateDesc();
	List<Discussion> findAllOrderByCategoryDesc();
}
