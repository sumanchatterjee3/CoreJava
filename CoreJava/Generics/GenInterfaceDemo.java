interface iMinMax<T extends Comparable<T>>{
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements iMinMax<T>{
    T[] vals;

    MyClass(T[] o){
        this.vals=o;
    }

    public T min(){
        T v = vals[0];

        for (int i=0;i<vals.length;i++)
            if(vals[i].compareTo(v)<0) v=vals[i];
            return v;
    }
    public T max(){
        T v = vals[0];

        for (int i=0;i<vals.length;i++)
            if(vals[i].compareTo(v)>0) v=vals[i];
        return v;
    }
}
public class GenInterfaceDemo {
    public static void main(String[] args) {
        Integer inmus[] = {1,2,3,4,5,6,7,8} ;
        Character chars[] = {'a','s','d','f','g','h','e','w'};

        MyClass<Integer> iOb = new MyClass<Integer>(inmus);
        MyClass<Character> ichar = new MyClass<Character>(chars);

        System.out.println("Max value of INUMS is : " + iOb.max());
        System.out.println("Min value of INUMS is : " + iOb.min());

        System.out.println("Max value of CHARS is : " + ichar.max());
        System.out.println("Min value of CHARS is : " + ichar.min());
    }
}
