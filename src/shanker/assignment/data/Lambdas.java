package shanker.assignment.data;

public class Lambdas extends SuperClass{

    private String member = "GRAND FAther";

    public interface Print{
        void scopes(String arg);
    }

    public interface Email{
        String constructEmail(String name);
    }
    Email em = (String str)-> str+"@gmail.com";

    public String getEmail(String name , Email email){
        String fstr = email.constructEmail(name);
        System.out.println(fstr);
        return fstr;
    }

    public void methodTest(String abc){
       Print printLambda = (String str)->{
           System.out.println(str);
           System.out.println(abc);
           System.out.println(this.member);
           System.out.println(super.member);

       } ;
       printLambda.scopes("LambdaShanker");
    }


    public static void main(String args[]){
       // new Lambdas().getEmail("Shanker",(String str)-> str+"@gmail.com");
        new Lambdas().methodTest("Shanker");
    }


}

/*
Method References::
(trade)->trade.isOpen();
can be written as :  trade::isOpen;



* */
