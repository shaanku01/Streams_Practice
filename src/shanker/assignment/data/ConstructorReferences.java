package shanker.assignment.data;

public class ConstructorReferences {
    class Movie{
        Movie(int i){

        }
        Movie(int i, String str){

        }
    }
    interface MovieFactory{
        public Movie create(int id);

    }
    MovieFactory f1 = (i)->new Movie(i);
    MovieFactory f2 = Movie::new;

    interface MovieFactory1{
        public Movie create(int id, String str);
    }
    MovieFactory1 f3 = (p,str)-> new Movie(p,str);
    MovieFactory f4 = Movie::new;


    //ArrayReference::
    interface StringArray{
        public String[] stringArr(int size);
    }

    StringArray arr1 = (int size)-> new String[size];
    StringArray arr2 = String[]::new;

}
