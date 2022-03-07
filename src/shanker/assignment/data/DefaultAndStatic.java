package shanker.assignment.data;

public class DefaultAndStatic {
    @FunctionalInterface
    interface test{
        int maths(int a,int b);
        //Default Methods:
        default void fun1(int p,String str){
            String f_str = p+str;
        }
        //Static methods::
        static void fun2(int x,int y){
            int z = x*y;
            System.out.println(z);
        }
    }


}
