public class GenericConstructor {
    private double d;

    <T extends Number> GenericConstructor(T arg){
        this.d = arg.doubleValue();
    }

    void showVal(){
        System.out.println("Val : "+d);
    }

    public static void main(String[] args) {
        GenericConstructor GC1 = new GenericConstructor(100);
        GenericConstructor GC2 = new GenericConstructor(232.56F);
        GC1.showVal();
        GC2.showVal();
    }
}
