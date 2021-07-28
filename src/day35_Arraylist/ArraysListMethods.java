package day35_Arraylist;

import java.util.ArrayList;

public class ArraysListMethods {
    public static void main(String[] args) {
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Vinigiar");
        groceryList.add("Bread");
        System.out.println(groceryList);

        groceryList.set(0,"Toilet Paper");
        groceryList.set(3,"Soda");
        System.out.println(groceryList);
        boolean hasToiletPaper=groceryList.contains("Toilet Paper");
        boolean hasToiletPaper2=groceryList.indexOf("Toilet Paper")>=0;
        System.out.println("hasToiletPaper2 = " + hasToiletPaper2);
        System.out.println("hasToiletPaper = " + hasToiletPaper);

        System.out.println("---------------------------------------");

        groceryList.remove(1);
        System.out.println(groceryList);
       boolean r1= groceryList.remove("Water");
        System.out.println(groceryList);
        System.out.println("r1 = " + r1);

       boolean r2= groceryList.remove("Face Mask");
        System.out.println(groceryList);
        System.out.println("r2 = " + r2);
        System.out.println("-------------------------------------------");
        ArrayList<Integer> List1=new ArrayList<>();
        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);
        List1.add(50);


        List1.remove((Integer) 30);
        System.out.println(List1);

        //System.out.println((double) 10);
        
        groceryList.clear();
        System.out.println("groceryList = " + groceryList);

        List1.clear();
        System.out.println("List1 = " + List1);

        System.out.println("---------------------------------------------------------");

        ArrayList<Character> list=new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

      //  list.indexOf('B'); //3
       // list.lastIndexOf('B');//3

        ArrayList<Character> uniqueCharacters=new ArrayList<>();
        for (Character each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each)){
                uniqueCharacters.add(each);
            }
        }
        System.out.println("uniqueCharacters = " + uniqueCharacters);

        System.out.println("------------------------------------------------------------");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);
        ArrayList<Character> result = new ArrayList<>(); //[A,B,C]

        for (Character each : characters) {
            if (!result.contains(each)){
               result.add(each);
            }
            }
        System.out.println("result = " + result);
        System.out.println("-------------------------------------------");
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        System.out.println("nums = " + nums);
        ArrayList<Integer> result2=new ArrayList<>();
        
        for (int i = nums.size() - 1; i >= 0; i--) {
                  //400 300 200 100
            result2.add(nums.get(i));
        }
        System.out.println("result2 = " + result2);
        System.out.println("--------------------------------------------");
        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(10);
        n1.add(20);
        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(10);
        n2.add(20);
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
    }
}
