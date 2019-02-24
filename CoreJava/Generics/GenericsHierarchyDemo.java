class GenH<T>{
    T ob;
    GenH(T o){
        this.ob=o;
    }
    T getOb(){
        return this.ob;
    }
}
class GenH2<T> extends GenH<T>{
    public GenH2(T o) {
        super(o);
    }
}
public class GenericsHierarchyDemo {
    public static void main(String[] args) {
        GenH<Integer> gh1 = new GenH<>(100);
        GenH2<Integer> gh2 = new GenH2<>(99);
        GenH2<String> gh2s = new GenH2<>("Generics Test");

        if(gh2 instanceof GenH2<?>)
            System.out.println("1. gh2 is an instance of GenH2");
        if(gh2 instanceof GenH<?>)
            System.out.println("2. gh2 is an isnatance of GenH");
        System.out.println();

        if(gh2s instanceof GenH2<?>)
            System.out.println("3. gh2s is an instance of GenH2");
        if(gh2s instanceof GenH<?>)
            System.out.println("4. gh2s is an instance of GenH");
        System.out.println();

        if(gh1 instanceof GenH2<?>)
            System.out.println("5. gh1 is an instance of GenH2");
        if(gh1 instanceof GenH<?>)
            System.out.println("6. gh1 is an instance of GenH");

      /*  if(gh2 instanceof GenH2<Integer>)
            System.out.println("gh2 is an instance of GenH2<Integer>");
            */
    }

}
