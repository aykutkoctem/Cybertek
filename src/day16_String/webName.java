package day16_String;

import java.util.Scanner;

public class webName {
    public static void main(String[] args) {
        String url ="www.cybertek.edu";

        int begining=url.indexOf(".")+1;
        int end=url.lastIndexOf(".");


        String name=url.substring(  url.indexOf(".")+1,url.lastIndexOf(".") );
        String domain=url.substring(end+1);
        System.out.println(domain);
        System.out.println(name);





    }
}
