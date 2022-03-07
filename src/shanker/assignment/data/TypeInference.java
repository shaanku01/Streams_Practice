package shanker.assignment.data;

public class TypeInference {
    public interface typeInference{
        void myAbsFun(int p , String q , double l);
    }



    public static void main(String args[]){
        typeInference t1 = (p,q,l)->{System.out.println(p);};
        t1.myAbsFun(10,"Shanker",10.2);
    }
}
