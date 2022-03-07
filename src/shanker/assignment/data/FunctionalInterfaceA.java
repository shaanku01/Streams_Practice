package shanker.assignment.data;

public class FunctionalInterfaceA {
    @FunctionalInterface
    public interface Test{
        int maths(int a,int b);
    }

    public void fun1(int a, int b,Test tst){
        int p = tst.maths(a,b);
        System.out.println(p);
    }

    public static void main(String args[]){
        FunctionalInterfaceA obj = new FunctionalInterfaceA();
        //Client-1
        obj.fun1(10,21,(a,b)->a*b);
        //Client-2
        obj.fun1(15,23,(a,b)->a+b);
        //Client-3
        obj.fun1(22,24,(a,b)->a-b);
        //Client-4
        obj.fun1(18,25,(a,b)->a/b);
    }
}
