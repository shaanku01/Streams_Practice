package shanker.assignment.data;

import java.util.function.Supplier;

public class SupplierFunction {

    Supplier<String []> fruitsSupplier = ()-> new String[]{"Apple","Mango"};

    public void fun1(){
        String arr[] = fruitsSupplier.get();
        for(String fruit : arr){
            System.out.println("The Fruit is :" + fruit);
        }
    }

    public static void main(String args[]){

        SupplierFunction obj = new SupplierFunction();
        obj.fun1();
    }

}
