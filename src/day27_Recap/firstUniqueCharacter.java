package day27_Recap;

public class firstUniqueCharacter {
    public static void main(String[] args) {
        String str="aaaa bbcccccdeffgggggggh";
        //index0f('a')==>0
        //lastIndexOf('a')==>0
        /*
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
        }
        
         */
        

        for (char each:str.replace(" ","").toCharArray()){

            if (str.indexOf(each)==str.lastIndexOf(each)){
                System.out.println("each = " + each);
                break;
            }
        }

    }
}
