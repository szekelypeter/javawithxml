package Movies;

import java.util.ArrayList;
import java.util.List;


public class Movie {
	private String title = "";
	private Genre genre = null;
	private long duration = -1;
	private double rate = -1;
	private List<Person> cast = new ArrayList<Person>();
	public static List<Movie> movies = new ArrayList<Movie>();


	public Movie(String title, Genre genre, long duration, double rate, List<Person> cast) {
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
		movies.add(Movie.this);
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString() {
		String persons = "";
		for (Person person : cast) {
			persons = persons + person.toXMLString();
		}

		return "<movie>" + "<title>" + title + "</title>" + "\n<genre>" + genre + "</genre>" + "\n<duration>" + duration
				+ "</duration>" + "\n<rate>" + rate + "</rate>" + "\n<cast>" + persons + "</cast>" + "</movie>";
	}
}
