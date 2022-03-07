package shanker.assignment.data;

interface Engine1{
    default String model(int id){
        return "Default Engine";
    }
}
interface Vehicle1 extends Engine1{
    default String model(int id){
        return "Default Engine";
    }
}

// Rule 1 : If both the interfaces has the same method and the class implements both the interfaces then the developer
// has to provide a class level implementation of the function.

// Rule 2: If there is a hierarchy then the nearest definition will be taken into consideration.
public class MultipleInheritance implements Vehicle1{
    public static void main(String args[]){

    }
}
