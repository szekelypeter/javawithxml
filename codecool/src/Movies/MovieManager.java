package Movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Person kate_winslet = new Person("Kate", "Winslet", Gender.FEMALE, true, true);
		Person leonardo_dicaprio = new Person("Leonardo", "DiCaprio", Gender.MALE, false, true);
		Person keanu_reeves = new Person("Keanu", "REeves", Gender.MALE, false, false);
		Person carrieanne_moss = new Person("Carrie-Anne", "Moss", Gender.FEMALE, false, false);
		Person marion_cotillard = new Person("MArion", "Cotillard", Gender.FEMALE, true, true);

		List<Person> titanic_cast = new ArrayList<Person>();
		titanic_cast.add(kate_winslet);
		titanic_cast.add(leonardo_dicaprio);
		Movie titanic = new Movie("Titanic", Genre.ROMANTIC, 200, 4.8, titanic_cast);

		List<Person> the_matrix_cast = new ArrayList<Person>();
		the_matrix_cast.add(keanu_reeves);
		the_matrix_cast.add(carrieanne_moss);
		Movie the_matrix = new Movie("The Matrix", Genre.SCI_FI, 140, 5.0, the_matrix_cast);

		List<Person> inception_cast = new ArrayList<Person>();
		inception_cast.add(leonardo_dicaprio);
		inception_cast.add(marion_cotillard);
		Movie inception = new Movie("Inception", Genre.SCI_FI, 160, 5.0, inception_cast);
		
		System.out.println(Tools.getMovieTitles(Movie.movies));
		System.out.println(Tools.countMoviesPerPerson(Movie.movies));
		System.out.println(inception.toXMLString());
		
		List<String> requested_movies=new ArrayList<String>();
		requested_movies.add("Titanic");
		requested_movies.add("Inception");
		
		try{
		PrintWriter writer=new PrintWriter("test_1.xml");
		String outPutString="";
		for (Movie movies : Movie.movies){
			for (String request: requested_movies){
			/*outPutString+=movies.toXMLString();*/
				if (movies.getTitle()==request){
					outPutString+=movies.toXMLString();
				}
			}
		}
		writer.println(Tools.toXMLTag("movies", outPutString));
		writer.close();
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
