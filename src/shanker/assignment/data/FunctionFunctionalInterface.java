package shanker.assignment.data;

import java.util.function.Function;

public class FunctionFunctionalInterface {

    Function<String , Movie> createMovieFnction = s -> new Movie(s);

    public void displayMovie(){
        Movie m2 = createMovieFnction.apply("Spider-Man");
        System.out.println(m2.movieName);
    }


    public static void main(String args[]){
        FunctionFunctionalInterface obj = new FunctionFunctionalInterface();
        obj.displayMovie();
    }


}

/*
Composing Functions::

Function<Employee,Manager> managerFinder = (emp)->getManager(emp);
Function<Manager,Employee> assistantFinder = (manager)->getPA(manager);

 -- andThen method:
 Function<Employee,Employee> PAFinder = managerFinder.andThen(assistantFinder);

 -- compose method:
 Function<Employee,Employee> empFinder = assistantFinder.compose(managerFinder);
  - reverse of andThen~;



*/
