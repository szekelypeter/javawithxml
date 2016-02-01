package Movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools {

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		ArrayList<Person> actors = new ArrayList<Person>();
		HashMap<Person, Integer> actingCounter = new HashMap<Person, Integer>();
		for (Movie movie : movies) {
			for (Person person : movie.getCast()) {
				actors.add(person);
			}
			for (Person pers : actors) {

				int totalValue = 0;
				for (Movie movi : movies) {
					for (Person person : movi.getCast()) {
						if (pers.equals(person)) {
							totalValue++;
						}
					}
				}
				actingCounter.put(pers, totalValue);
			}
		}
		return actingCounter;

	}

	public static ArrayList<String> getMovieTitles(List<Movie> movies) {
		ArrayList<String> titles = new ArrayList<String>();
		for (Movie movie : movies) {
			titles.add(movie.getTitle());

		}
		return titles;
	}

	public static String toXMLTag(String tagName, String value) {
		return String.format("<%s>%s</%s>", tagName, value, tagName);

	}
}

