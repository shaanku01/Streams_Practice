package shanker.assignment.data;

interface IMovie{
    public boolean check(int id);
}

public class MethodReferences {
    //Static method References::
    public void testMovieStaticReference(){
        IMovie m1 = (i)-> (i>10 && i<100)?true:false;
        IMovie m2 = MethodReferences::isClassic;
    }

    //Instance Method Reference::
    public void testMovieInstanceReference(int i){
        IMovie m3 = (p)-> (p>10 && p<100)?true:false;
        MethodReferences obj = new MethodReferences();
        IMovie m4= obj::isTop10;
    }
    public boolean isTop10(int id){
        return false;
    }


    public static boolean isClassic(int movieId){
        return true;
    }

}
