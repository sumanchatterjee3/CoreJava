import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//An annotation type declaration .
@Retention(RetentionPolicy.RUNTIME)
@interface myAnno{
    String strr();
    int val();
}
public class Meta {
    //Annotate a method
    @myAnno(strr = "Annotation Example", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        //Obtain the annotation for this method
        //and display the values of the members

        try{
            //First get Class object that represents this class
            Class<?> c = ob.getClass();

            //now get a Method Object that represents this method

            Method m = c.getMethod("myMeth");

            //Get the annotation for thsi class

            myAnno anno = m.getAnnotation(myAnno.class);

            System.out.println(anno.strr()+"  "+anno.val());

        }
        catch (NoSuchMethodException nsmeException){
            System.out.println("Method Not Found");

        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
