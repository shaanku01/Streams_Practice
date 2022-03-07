package shanker.assignment.data;

import java.util.function.Predicate;

public class PredicateFunction {
    //Predicate<Employee> bonusLambda = (employee -> employee.getRatings()?true:false);
    // Predicate<String> emptyString = s->s.isEmpty();

    // Composite Predicate::
    // Logical And:
    //Predicate<Trade> bigTrade = (t)->t.getBigTrade();
    //Predicate<Trade> cancelledTrade = (t)-> t.getCancelledTrade();
    // Logical AND :
    //Predicate<Trade> bigAndCancelledTrade = bigTrade.and(cancelledTrade);
    //Logical OR :
    //Predicate<Trade> GoogleTrades = (t)->t.getCustomer("Google");
    //Predicate<Trade> AppleTrade = (t)->t.getCustomer("Apple");
    //Predicate<Trade> GoogleORAppleTrades = GoogleTrades.or(AppleTrades);
    //Negate:
    //Predicate<Trade> notANewTrade = newTrade.negate();
    //Equals
//    List<Trade> trades = TradeUtil.createTrades();
//    Trade t1 = new Trade("GooG",20000,"Cancelled");
//    Predicate<Trade> p1 = Predicate.isEqual(t1);
//    for(Trade t in trades){
//        if(p1.test(t)){
//            System.out.println("Matching Trade "+t);
//
//        }
//    }



}
