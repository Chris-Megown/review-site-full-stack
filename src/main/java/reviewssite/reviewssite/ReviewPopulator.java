package reviewssite.reviewssite;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepos;

	@Resource
	private CategoryReposirty categoryRepos;

	@Override
	public void run(String... args) throws Exception {

		// Category things
		Category Marvel = new Category("Marvel", "images/marvel/marvel.png");
		categoryRepos.save(Marvel);

		Category DC = new Category("DC", "images/dc/dc_logo_clear_smaller.png");
		categoryRepos.save(DC);

		Review superman = new Review("Superman", "Alias: Clark Kent, Kal-El", "images/dc/superman_00s.jpg", DC,
				"Superman is the protagonist of Superman franchises, he is the first major superhero. Superman was born on the planet Krypton which was about to be destroyed when his mother and father sent their baby to planet Earth where he could survive. He was found by the Kents on their farm in Kansas after his spacecraft crash landed. They gave him his Earth name of Clark Kent. Superman is considered to be the most powerful superhero character of all time.");
		reviewRepos.save(superman);
		Review batman = new Review("Batman", "Alias: Bruce Wayne", "images/dc/batman_im_batman.jpg", DC,
				"Batman is the protagonist of the Batman comics, cartoon, movies, and video games franchises. His origin begins after experiencing the horrible death of his beloved parents at a young age. Bruce Wayne then travels the world learning different martial arts and fighting styles. Before returning to his home Gotham City, where he then creates a vigilante who will be known as Batman. He is largely considered one of the greatest superheroes of all time.");
		reviewRepos.save(batman);
		Review wonderwoman = new Review("Wonder Woman", "Alias: Diana Prince", "images/dc/wonderwoman_00s.jpg", DC,
				"Wonder Woman is the founding member of the Justice League along with being the protagonist of Wonder Woman franchises. She is an Amazon who fights injustice with ancient weapons, super strength, and the ability to fly.");
		reviewRepos.save(wonderwoman);
		Review daredevil = new Review("Daredevil", "Alias: Matthew Michael Murdock", "images/marvel/daredevil.jpg",
				Marvel,
				"Daredevil is a hero from Marvel who was blinded in an accident which also gave him a type of radar-sense that enhanced all his other senses more than a normal human being. By night he is a costumed vigilante, by day he is Matthew Michael Murdock a lawyer fighting for the good of his neighborhood Hell’s Kitchen.");
		reviewRepos.save(daredevil);
		Review starLord = new Review("Star Lord", "Alias: Peter Jason Quill", "images/marvel/star_lord_gun_up.jpg",
				Marvel,
				"Star Lord is a superhero who is the leader of the Guardians of the Galaxy. Created by Steve Englehart and Steve Gan, first appearing in 1976. Peter Quill is the son of a human mother and alien father, Quill assumes the mantle of Star-Lord, an interplanetary policeman… sort of.");
		reviewRepos.save(starLord);
		Review drStrange = new Review("Doctor Strange", "Alias: Stephen Vincent Strange",
				"images/marvel/dr_strange_comic_00s.jpg", Marvel,
				"Dr. Strange is a regular part of The Defenders. Unlike most heroes Doctor Strange deals with universe threatening events rather than petty crimes or silly world threats. He is titled the Sorcerer Supreme, a title which comes with the duty of protecting the universe against invading forces of evil from other realms.");
		reviewRepos.save(drStrange);
	}

}
