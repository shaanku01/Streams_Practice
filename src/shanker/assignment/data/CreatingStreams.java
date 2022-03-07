package shanker.assignment.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Creating Streams::
public class CreatingStreams {

    //From Collections
    private void testCollectionStreams(){
        //List<Movie> movies = MovieUtil.createMovies();
      //  movies.stream().forEach(System.out::println)


    }
    //Empty Stream
    private void testEmptyStreams(){
        Stream<Movie> moviesEmptyStream = Stream.empty();
        System.out.println("Empty Stream" + moviesEmptyStream.count());
    }
    //From values/arrays;
    private void testStreamsFromValues(){
        Stream<String> movieName = Stream.of("RRR","Bahubali");
        System.out.println(movieName.count());

        String [] movieNames = new String[]{"RobinHood","IronMan"};
        Stream<String> newStream = Stream.of(movieNames);

    }
    //From a File
    private void testFileStreams(){
        try{
           Stream<String> fileContent =  Files.lines(Paths.get("file.txt"));
           fileContent.forEach(System.out::println);
        }catch(IOException ex){
            System.out.println(ex.getCause());
        }





    }

    private void testGenerateIterateStreams(){
//        Stream<Double> randomStream = Stream.generate(Math::random);
//        randomStream.forEach(System.out::println);

        //iterate:
       Stream<Integer> myStream =  Stream.iterate(1,i->i+1);
       myStream.forEach(System.out::println);
    }

    public static void main(String args[]){
        new CreatingStreams().testGenerateIterateStreams();
    }

    private void testInternalIteration1(){
//        movies.Stream()
//                .filter(Movie::isClassic)
//                .map(Movie::getName)
//                .limit(2)
//                .forEach(System.out::println);
    }



    // Lazy and Eager Methods:

    // Lazy functions are those which do not get executed unless and until some other function force it to execute.
    //Eager function force the lazy methods to execute. and are mostly the termainal operations

    // Example:
//    Stream<Movie> myList = movies.stream()
//            .filter(i->i.getClassic().equals("Horror")?true:false)
//            .map(s->{
//
//                return s;
//            });
//    System.out.println(""+mylist.count());


  // Primitive Streams::
   // Optional<Integer> quantity = trades.stream().map(Trade::getQuantity).reduce(Integer::sum);


    private void intStream(){
        int[] ints = new int[]{2,4,6,8,10};
        IntStream intStream = IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream21 = IntStream.of(1,2,3,4,5,6,7);
        intStream21.forEach(System.out::println);

    }

    //trades.stream().mapToInt(Trade::getQuantity).sum();





}
