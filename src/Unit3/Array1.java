package Unit3;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner input = new Scanner(System.in);;
        for(int i=0;i<a.length;i++){
            a[i]= input.nextInt();

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
