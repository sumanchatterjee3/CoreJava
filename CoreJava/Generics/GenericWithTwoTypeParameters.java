//A simple generic class with two type parameters T and V.
 class TwoGen<T,V>{
    private T ob1;
    private V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

     T getOb1() {
        return ob1;
    }

     V getOb2() {
        return ob2;
    }
    void showTypes(){
        System.out.println("Type of 'T' is : " +ob1.getClass().getName());
        System.out.println();
        System.out.println("Type of 'V' is : " +ob2.getClass().getName());
    }
}
public class GenericWithTwoTypeParameters {
    public static void main(String[] args) {
        TwoGen<Integer,String> targetObj = new TwoGen<>(88, "Generics");

        targetObj.showTypes();

        int t = targetObj.getOb1();
        System.out.println("Value : " +t);

        String v = targetObj.getOb2();
        System.out.println("Value : " +v);
    }
}
