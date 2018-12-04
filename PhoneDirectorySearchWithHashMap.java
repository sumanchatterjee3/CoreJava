package com.suman.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectorySearchWithHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> phoneMap = new HashMap<>();
        int n = scanner.nextInt();
        for (int i =0 ; i<=n-1 ; i++){
            //Populate the hashmap with the Name and Phone Number as<Key,Value>.
            phoneMap.put(scanner.next(),scanner.nextInt());
        }
        scanner.nextLine();
        //System.out.println(phoneMap.keySet()+ " " + phoneMap.values());
        while(scanner.hasNext()){
            String name=scanner.next();
            if(phoneMap.containsKey(name)){
                //Retrieve the value of the phone number(Value) against the search string being entered in the console (Key)
                System.out.println(name+"="+phoneMap.get(name));
            }
            else{
                System.out.println("Not found");
            }
        }
        scanner.close();

    }
}
