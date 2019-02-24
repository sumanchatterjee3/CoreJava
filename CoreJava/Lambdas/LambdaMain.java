package Lambdas;

import java.util.*;

public class LambdaMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("Printing Line 2");
            System.out.println("Printing Line 3");
        }).start();

        Employee john = new Employee("John Doe", 45);
        Employee suman =new Employee("Suman Chatterjee", 35);
        Employee jack = new Employee("Jack Huge", 401);
        Employee snow = new Employee("Snow White", 21);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(suman);
        employees.add(jack);
        employees.add(snow);

        Collections.sort(employees,(Employee e1, Employee e2)->
                e1.getName().compareTo(e2.getName()));

//        Implementing the sort function withour Lambda expressions
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        });

        for(Employee employee : employees){
            System.out.println(employee.getName());
        }

//        String sillyString = doStringStuff(new UpperConcat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        },
////                employees.get(0).getName(),employees.get(1).getName());
////        System.out.println(sillyString);

        /*Do the same previous implementation using lambda*/
        UpperConcat uc =( s1,  s2) ->s1.toUpperCase()+s2.toUpperCase();
        String sillyString = doStringStuff(uc,employees.get(0).getName(),employees.get(1).getName());
        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

    }
    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);
    }


}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat{
    public String upperAndConcat(String s1, String s2);
}
class AnotherClass{
    public String doSomething(){
        UpperConcat uc = (s1,s2) ->{
            System.out.println("The Lambda Expression's class is : "+getClass().getSimpleName());
            String result = s1.toUpperCase()+s2.toUpperCase();
            return result;
        };
        System.out.println("The Another Class's name is : "+getClass().getSimpleName());
        return LambdaMain.doStringStuff(uc,"String1","String2");
//        System.out.println("The Another Class class's name is : " +getClass().getName());
//        return LambdaMain.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The Anonymous Class class's name is : " +getClass().getName());
//               return s1.toUpperCase()+s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }
}