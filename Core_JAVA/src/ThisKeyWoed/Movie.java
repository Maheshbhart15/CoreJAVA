package ThisKeyWoed;

import java.util.ArrayList;
// used in java.lan collection frmaework ArrayList
// Iterator
// for each()

public class Movie {
    int movieID;
    String movieName;
    int moviePrize;

    public void Get(int movieID, String movieName, int moviePrize) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.moviePrize = moviePrize;
    }

    public static void main(String[] args) {
        Movie movie = new Movie();

        ArrayList<Movie> movies = new ArrayList<>();

        Movie movie1=new Movie();
        movie1.Get(10,"Abc1",21);
        movies.add(movie1);
      Movie  movie2= new Movie();
        movie2.Get(2, "abc2", 22);

        movies.add(movie2);
        // Use an enhanced for-loop to iterate over the ArrayList
        for (Movie m : movies) {
            // Access and print the details of the current movie
            System.out.println("Movie ID: " + m.movieID);
            System.out.println("Movie Name: " + m.movieName);
            System.out.println("Movie Prize: " + m.moviePrize);
            System.out.println(); // Print a blank line between movies for better readability
        }
    }
}
