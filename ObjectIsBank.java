package com.suman.HackerRank;

public class ObjectIsBank {
    public static void main(String[] args) {
        Object obj = "bank";
        System.out.println(checkObjIsBank(obj));
    }

    public static boolean checkObjIsBank(Object obj){
        try{
            if(obj==null || obj.toString().trim().equals("")){
                return false;
            }else if(obj.toString().trim().equals("bank")){
                return true;
            }
            else
                return false;
        }
        catch(Exception e){
            return true;
        }
    }
}
