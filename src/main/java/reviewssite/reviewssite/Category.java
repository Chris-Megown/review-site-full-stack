package reviewssite.reviewssite;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	// Variables

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String categoryName;
	private String categoryImage;

	@OneToMany(mappedBy = "category")
	private Set<Review> reviews;

	// used for JPA

	public Category() {

	}

	public Category(String categoryName, String categoryImage) {
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
	}

	// Getters

	public long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getCategoryImage() {
		return categoryImage;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

}
