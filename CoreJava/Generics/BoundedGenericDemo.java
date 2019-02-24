//Here we define Stats and mention 'T' is of Type Number super class and can be replaced
// by Number of any of its subclasses.
class Stats<T extends Number>{
    private T[] num; //Array of numbers

    Stats(T[] num) {
        this.num = num;
    }
    double average(){
        double sum = 0.0;
        for(int i = 0; i<= num.length-1;i++){
            sum += num[i].doubleValue();
        }
        return  sum/num.length;
    }
    boolean sameAvg(Stats<?> ob){
        if(average()==ob.average())
            return true;
        else
            return false;
    }
}
public class BoundedGenericDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<>(inums);
        double i = iOb.average();
        System.out.println("The average is : " +i);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double d = dOb.average();
        System.out.println("The average is : " +d);

        if(iOb.sameAvg(dOb))
            System.out.println("The averages are same");
        else
            System.out.println("The averages are different");
    }
}
