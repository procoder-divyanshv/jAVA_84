package Unit3;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        System.out.println(s1.substring(0,6));
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.substring(0,1).toUpperCase()+s2.substring(1));
        if(s1.compareTo(s2)>0){
            System.out.println(s1.compareTo(s2));

        }
        else{
            System.out.println(s1.compareTo(s2));
        }
        System.out.println(s1.length() + s2.length());

    }
}
