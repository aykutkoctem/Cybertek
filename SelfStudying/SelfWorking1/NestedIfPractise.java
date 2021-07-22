package SelfWorking1;

public class NestedIfPractise {
    public static void main(String[] args) {
        String bachType= "US morning";
        boolean isValid= bachType=="US morning" || bachType=="US evening" ||bachType=="EU";
        String result="";
        if (isValid){

            if (bachType=="US morning"){
                result="10am-5pm EST. M,T,TH,F";

            }else if (bachType=="US evening"){
                result="7pm-10pm EST. M,T,W,TH,S,S";
            }else {
                result="10am-5pm EST M,T,W,TH,F";
            }

        }else {
            result="Invalid";
        }
        System.out.println("result = " +result);

        System.out.println("----------------------------------------");
        int age=13;
        String ageGroup="";
        if (age>=0 && age<=150){
            if (age>55){
                ageGroup="Senior";
            }if (age>=21){
                ageGroup="Adult";
            }else {
                ageGroup="Teenager";
            }


        }else {
            ageGroup="invalid";
        }
        System.out.println("You are " +ageGroup);
    }
}
