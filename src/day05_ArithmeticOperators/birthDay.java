package day05_ArithmeticOperators;

public class birthDay {
    public static void main(String[] args) {
        String name= "John",
               birthMonth= "May";
         int  birthDay=15,
              birthyear=1993;

        System.out.println(name+ "was born on "+birthMonth+ "/"+birthDay+ "/"+birthyear+"." );

        int age= 2021-birthyear;
        System.out.println(name+ " is "+age+" years old.");





    }
}
/*
3. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.


 */