package shanker.assignment.data;
/*Creating a Lambda Expression   */
public class Main {

    interface Greeting{
         String sayHello(String g);
    }
    public void testGreeting(String a , Greeting g){
        String result = g.sayHello(a);
        System.out.println(result);
    }


    public static void main(String[] args) {
        new Main().testGreeting("Shanker",(String str)->"Hello , "+str);
        new Main().testGreeting("Hary",(String str)->"Hello , "+str);
        new Main().testGreeting("",(String str)->{
            if(str==""){
                return "Did you forget something?";
            }
            else{
                return "Hello , "+str;
            }
        });

    }

    interface Tradable<Trade>{
        boolean check(Trade t);
    }

    //Tradable<Trade> bigTradeLambda = (trade)->{trade.isBigTrade()};
    //Tradable ibmTradeLambda = (trade)->{trade.getInsrument().equals("IBM")}
}
