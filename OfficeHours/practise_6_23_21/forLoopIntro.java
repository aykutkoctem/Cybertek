package practise_6_23_21;

public class forLoopIntro {
    public static void main(String[] args) {
        /*
        for(init,condition,iteration)
        init  : int i =0 // char a='a'
        condition:  true//false
        iteration: inc//dec   i+=10   i++   i-=10  i--
         */
        // Print out Cybertek's characters one by one
        int i=0;
        for ( i=0; i<10; i++){
            System.out.print(i);
        }
        System.out.println(" Out of loop");
        System.out.println(i);
        String name="Cybertek School";
        for (i=0; i<name.length(); i++){
            System.out.print(name.charAt(i));
        }
        System.out.println("-------------REVERSE--------------------------");

        for (i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
            System.out.println("---------");
        }
        for (i=0; i<name.length(); i++){
            //charAt
            if (name.charAt(i)=='a' ||name.charAt(i)=='i'||name.charAt(i)=='o' ||name.charAt(i)=='u'||name.charAt(i)=='e'){
                continue;
            }
            System.out.print(name.charAt(i));
        }
    }
}
