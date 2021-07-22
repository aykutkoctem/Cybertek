package practise_06_09_21;

public class Army {
    public static void main(String[] args) {
        boolean isCitizenship=true;
        boolean isResident=true;
        boolean hasDiploma=true;
        int age=19;
        if (isCitizenship || isResident){

            if (age>=18 && age<=35){
                if (hasDiploma){
                    System.out.println("You are qualify for army");
                }

            }
            else{
                System.out.println("your age must be between 18 to 35 years old");
            }

        }else{
            System.out.println("You must be U.S. citizen or residence");
        }
    }
}
