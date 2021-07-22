package day20_Loops;

public class CatsAndDogs {
    public static void main(String[] args) {
        String sentence = "Cat Dog Cat Dog Cat";

        int numberOfCat = 0;
        int numberOfDog = 0;
for (int i=0; i<=sentence.length()-3; i++){

    String each=sentence.substring(i,i+3);

    if (each.equals("Cat")){
        numberOfCat++;
    }
    if (each.equals("Dog")){
        numberOfDog++;
    }
}

        System.out.println("number of cats ="+numberOfCat);
        System.out.println("number of dog ="+numberOfDog);
    }
}