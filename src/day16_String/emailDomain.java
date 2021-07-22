package day16_String;

public class emailDomain {
    public static void main(String[] args) {
        String email="CybertekSchool@gmail.com";

        int beginingIndex =email.indexOf("@")+1;
        int endIndex =email.indexOf(".");
        String domain =email.substring(beginingIndex,endIndex);
        System.out.println("domain= " +domain);

    }
}
