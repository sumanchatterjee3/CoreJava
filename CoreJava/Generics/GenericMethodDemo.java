public class GenericMethodDemo {
    static <T extends Comparable<T>,V extends T> boolean isIn(T x, V[] y){
        for(int i = 0; i<y.length;i++)
            if(x.equals(y[i])) return true;
            return false;
    }

    public static void main(String[] args) {
        Integer inums[] ={1,2,3,4,5};

        if(isIn(2,inums))
            System.out.println("2 is present in INUMS");

        if(isIn(7,inums))
            System.out.println("7 is present in INUMS");
        else System.out.println("7 is not present in INUMS");

        String str[] = {"one","two","three","four","five"};
        if (isIn("two",str))
            System.out.println("'two' is present in str");
    }
}
