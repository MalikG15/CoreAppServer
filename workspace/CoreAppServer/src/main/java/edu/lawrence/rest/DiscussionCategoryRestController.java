package edu.lawrence.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import java.util.Date;

import edu.lawrence.data.DiscussionCategoryRepository;
import edu.lawrence.to.DiscussionCategory;

@RequestMapping("/discussioncategory")
@RestController
public class DiscussionCategoryRestController {
	
	@Autowired
	DiscussionCategoryRepository discussioncategoryrepository;
	
	@RequestMapping("/all")
	public List<DiscussionCategory> findAll() {
		return discussioncategoryrepository.findAll();
	}
	
	@RequestMapping("/allbydate")
	public List<DiscussionCategory> findAllByDate() {
		return discussioncategoryrepository.findAllOrderByDateDesc();
	}
	
	@RequestMapping("/allbycategory")
	public List<DiscussionCategory> findAllByCategory() {
		return discussioncategoryrepository.findAllOrderByCategoryDesc();
	}
	
	@RequestMapping("/searchbycategory")
	public List<DiscussionCategory> findAllByCategory(@RequestParam String category) {
		return discussioncategoryrepository.findByCategoryLike(category); // Use a wildcard symbol at both ends of input '%example%'
	}
	
	@RequestMapping(value = "/searchbydategreaterthan", method = RequestMethod.POST)
	public List<DiscussionCategory> findAllByDateGreaterThan(@RequestBody Date date) {
		return discussioncategoryrepository.findByDateGreaterThanEqual(date);
	}
	
	@RequestMapping(value = "/searchbydatelessthan", method = RequestMethod.POST)
	public List<DiscussionCategory> findAllByDateLessThan(@RequestBody Date date) {
		return discussioncategoryrepository.findByDateLessThanEqual(date);
	}
	
	@RequestMapping(value = "/newdiscussioncategory", method = RequestMethod.POST)
	public String createNewDiscussionCategory(@RequestBody DiscussionCategory newcategory) {
		if (discussioncategoryrepository.findByCategoryLike(newcategory.getCategory()) != null) {
			return null;
		}
		else {
			discussioncategoryrepository.saveAndFlush(newcategory);
			return newcategory.getDiscussioncategoryid();
		}
	}
	
	@RequestMapping("/deletecategory")
	public void deleteDiscussionCategory(@RequestParam String categoryid, @RequestParam String userid) {
		DiscussionCategory DiscussionCategoryEntity = discussioncategoryrepository.findByDiscussionCategoryId(categoryid);
		discussioncategoryrepository.delete(DiscussionCategoryEntity);
	}

}
