package day35_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BalkOperation {

    public static void main(String[] args) {
       ArrayList<Integer> numbers=new ArrayList<>();
       numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
     System.out.println(numbers);

        ArrayList<Integer> list=new ArrayList<>();
      //  list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(numbers);
        System.out.println(list);
        list.addAll(Arrays.asList(10,11,12,13,14,15));
        System.out.println(list);
        System.out.println("--------------------------------------------");
        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList("Aykut","Gizem","Abbas","Abbas","Abbas","Abbas","Atilla","Ekaterina"));
        System.out.println(students);
        students.removeAll(Arrays.asList("Aykut","Gizem","Abbas"));
        System.out.println(students);

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,1,2,2,2,3,3,3,4,4,5,5,5,5,6,7,7,8,9,1,1,1,1,1,1,1));
       // nums.removeAll(Arrays.asList(1));
        nums.retainAll(Arrays.asList(1));
        System.out.println(nums);
        System.out.println("------------------------------------------------");

        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Aykut","Gizem","Abbas","Abbas","Abbas","Abbas","Atilla","Ekaterina"));
        employees.retainAll(Arrays.asList("Atilla","Ekaterina"));
        System.out.println(employees);
        System.out.println("------------------------------------");
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda","Milk","Wine","Beer","Eggs","Bread","Water","Apple","Cherry"));
        
        boolean r=groceryList.contains(Arrays.asList("Soda","Wine","Beer","Coffee"));
        System.out.println("r = " + r);
    }
}
