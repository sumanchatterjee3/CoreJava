//NonGenDemo is functionally equivalent to Gen but does not use Generics

class NonGen{
    private Object ob; //ob is of type "Object"

    NonGen(Object ob) {
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }

    //Show type of ob

    void showType(){
        System.out.println("Type of 'ob' is : " +ob.getClass().getName());
    }
}
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb(); //Typecasting to (Integer) is mandatory here else there will be compilation error
        System.out.println("Value of 'v' is : " +v);
        System.out.println();

        NonGen strOb = new NonGen("This is String Version of NonGen");

        strOb.showType();

        String s = (String) strOb.getOb(); //Typecasting to (String is mandatory)
        System.out.println("Type of 's' is : "+s);
        System.out.println();
    }

}
