package shanker.assignment.data;

import java.util.function.Consumer;
class Movie{
    public String movieName;
    public Movie(String str){
        this.movieName = str;
    }
}

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m->System.out.println("Printing the Movie Information "+m.movieName);
    Consumer<Movie> persistMovie = m->persist(m);
    Consumer<Movie> notifyMovie = m->notify(m);

    private void notify(Movie m) {
        System.out.println("Notifying the movie " + m.movieName);
    }

    private void persist(Movie m) {
        System.out.println("Persisting the movie "+m.movieName);
    }
    private void testFun(Movie movie_1){
        printInfo.accept(movie_1);
      Consumer<Movie> composite =  printInfo.andThen(persistMovie).andThen(notifyMovie);
      composite.accept(movie_1);
    }


    public static void main(String args[]){
        Movie movie_1 = new Movie("RRR");
        ConsumerFunctionalInterface obj = new ConsumerFunctionalInterface();
        obj.testFun(movie_1);

    }



}
