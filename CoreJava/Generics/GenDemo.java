//A simple GENERIC class. Here "T" is a type parameter that will be replaced by  real type when an object of type Gen is created.

class Gen<T>{
    private T ob;

    //Pass teh constructor, a reference to an object of type "T"
    Gen(T ob) {
        this.ob = ob;
    }

    //Return Ob
    T getOb(){
        return ob;
    }

    //Show type "T"
    void showType(){
        System.out.println("Type of T is : "+ob.getClass().getName());
    }
}

//Demonstrates the Generic Class
public class GenDemo {
    public static void main(String[] args) {
        //create Gen reference for Integers
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("The Value of V : "+v);
        System.out.println();

        Gen<String> strOb = new Gen<> ("Generic String Test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println(str);
    }
}
