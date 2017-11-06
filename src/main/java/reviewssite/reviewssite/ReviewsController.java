package reviewssite.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	private ReviewRepository reviewRepos;

	@Resource
	private CategoryReposirty categoryRepos;

	@RequestMapping("/review")
	public String fetchReview(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelReview", reviewRepos.findOne(id));
		return "review-template";
	}

	@RequestMapping("/allreviews")
	public String showAll(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelReviews", categoryRepos.findOne(id));
		return "reviews-template";
	}

	@RequestMapping("/categories")
	public String findCategory(Model model) {
		model.addAttribute("modelCategories", categoryRepos.findAll());
		return "categories-template";
	}

}
