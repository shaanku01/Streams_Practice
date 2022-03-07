package shanker.assignment.data;

interface Engine{
    default String make(){
        return "ENGINE MAKE";
    }
}
interface Vehicle{
    default String model(){
        return "Vehicle Model";
    }
}

public class InheritingBehaviour implements Engine,Vehicle {

    public void integration(){
        String str = Engine.super.make() + Vehicle.super.model();
        System.out.println(str);
    }
    public static void main(String args[]){
        InheritingBehaviour obj = new InheritingBehaviour();
        obj.integration();
    }
}
