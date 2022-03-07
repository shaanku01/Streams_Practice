package shanker.assignment.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {


    private void testFiltering(){
//        Stream<Employee> empList = empData.stream()
//                .filter(Employee::isExecutive);
//        empList.forEach(System.out::print);
        System.out.println("Hello World");
    }

    public static void main(String args[]){
        new StreamOperations().testFiltering();



    }

    //Mapping
//    Stream<String> empStream = employees.stream()
//            .map(Employee::getName)
//            .map(String::toUpperCase);
//    empStream.forEach(System.out::println);


    // Collections::
    // Into a list::
    //List<Trade> my_list = trades.streams().collect(Collectors.tolist());

    //Into a set::
    //Set<Trades> my_set = trades.stream().collect(Collectors.toSet());

    //Into a Map::
    //Map<String,Movie> my_map = trades.stream().collect(toMap(Movie::getName,movie->movie));

    //Distinct , Limit and Skip::
//    Stream<String> emp_result = employee
//            .stream()
//            .map(Employee::getName)
//            .distinct()
//            .skip(2)
//            .limit(5);

    // Short Circuit Methods::

    // Optional trade = trades.stream().filter(predicate).findFirst();
    // Optional trade = trades.stream().filter(predicate).findAny();
    // boolean val = emp.stream().filter(Predicate).anyMatch(t->t.getStatus().equals("ROTTEN"));
    // boolean val = emp.stream().filter(Predicate).allMatch(t->t.getInstrument().equals("IBM"));
    // boolean can_trade = emp.stream().filter(predicate).noneMatch(predicate);


    //Reducing Operation:
//    Optional<String> instLit = trades.stream().map(Trade::getInstrument)
//            .reduce((a,b)-> a+""+b);


//    List<Integer> ints = Arrays.asList(11,1,2,2);
//    ints.stream().reduce(10,(i,j)->i+j);

    
// Grouping::
//    Map<String , List<Employee>> cityEmployee = employee.stream()
//        .collect(Collectors.groupingBy(Employee::getCity))
    //Advanced Grouping::
//    Map<String,Map<String , List<Employee>>> my_map = employees().stream()
//        .collect(groupingBy(Empoyee::getDepartment),groupingBy(Employee::getCity));



    //Partitioning::
//    Map<Boolean,List<Employee>> empPartition = employee.stream()
//            .collect(Collectors.partitioningBy(Employee::isExecutive));
//
//    Map<Boolean,Map<String,List<Employee>>> exectEmployees =
//            employee.stream()
//                    .collect(partitioningBy((Employee::isExecutive),groupingBy(Employee::getDepartment)));

//    Map<Boolean,Map<Boolean,List<Employee>>> execEMployee=
//            employee.stream().collect(partitioningBy(Employee::isExecutive),partitioningBy(Employee::isSenior));

// Range and Stats::
//    IntStream ints = IntStream.range(1,100);
//    ints.forEach(System.out::println);
//
//
//    IntStream ints = IntStream.rangeClosed(1,100);
//    OptionalInt max = ints.max();
//    OptionalInt max = ints.min();
//    OptionalInt avg = ints.average();







}
