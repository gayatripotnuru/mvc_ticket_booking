package com.MovieApp.MovieApp.controller;

import java.util.ArrayList;

import java.util.List;

import com.MovieApp.MovieApp.Entity.Movie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	private List<Movie> movieList;

	public DashboardController() {
		movieList = new ArrayList<>();

		movieList.add(new Movie(101,
				"https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ_gA25hvAzvrTHQaotqRuOVJqQbWScm5Ig5dF4ctHmnF5bUjPpUFqKTHZRqrm8CwG-98ILbA",
				"RRR", "4.5"));
		movieList.add(new Movie(102,"https://upload.wikimedia.org/wikipedia/en/1/17/Sarkaru_Vaari_Paata.jpg",
				"Sarkaru Vaari Paata", "4.3"));
		movieList.add(new Movie(103,
				"https://assets-in.bmscdn.com/iedb/movies/images/mobile/thumbnail/xlarge/orange-telugu-et00005527-1679575263.jpg",
				"Orange", "4.3"));
		movieList.add(new Movie(104,"https://upload.wikimedia.org/wikipedia/en/5/56/Jalsa_poster.jpg", "Jalsa", "4.3"));
		movieList.add(new Movie(105,"https://upload.wikimedia.org/wikipedia/en/6/6c/Lucky_Baskhar_film_poster.jpg",
				"Lucky Baskhar", "4.3"));
		movieList.add(
				new Movie(106,"https://upload.wikimedia.org/wikipedia/en/d/d6/Sarrainodu_poster.jpg", "Sarrainodu", "4.3"));
		movieList.add(new Movie(107,
				"https://assets-in.bmscdn.com/iedb/movies/images/mobile/thumbnail/xlarge/gabbar-singh-telugu-et00007159-1665126274.jpg",
				"Gabbar Singh", "4.3"));
		movieList.add(new Movie(108,"https://i.pinimg.com/736x/80/3f/cd/803fcd5a217628ddc58845b6bec3732f.jpg", "Pushpa 2",
				"4.5"));
		movieList.add(new Movie(109,"https://i.pinimg.com/736x/54/7c/4b/547c4b72edfc36d1d82a31d2365f3c30.jpg", "Godavari",
				"4.5"));
		movieList.add(
				new Movie(110,"https://i.pinimg.com/736x/0a/8b/84/0a8b845a6cb428239d764bb248e1b489.jpg", "Pushpa", "4.5"));
		movieList.add(new Movie(111,"https://i.pinimg.com/736x/07/77/01/0777016e325b7b183af923a6de3c8ceb.jpg",
				"Game Changer", "4.5"));
		movieList.add(new Movie(112,"https://i.pinimg.com/736x/02/f4/73/02f47390c39da4f2a806ba88bdb4178a.jpg",
				"Sankranthi Ki Vasthunam", "4.5"));
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
	    model.addAttribute("movieList", movieList);
	    return "dashboard"; 
	}

}
