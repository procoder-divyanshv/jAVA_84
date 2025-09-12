package Unit3;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
         h1.add(1);
         h1.add(2);
         h1.add(1); //set will contain the unique elements in it
         for(int val: h1){
             System.out.println(val);

         }
         h1.remove(1);
         System.out.println(h1.size());

         Scanner input= new Scanner(System.in);
         int n=input.nextInt();
         for(int i=0;i<n;i++){
             h1.add(input.nextInt());

         }
        System.out.println(h1);
        int m=input.nextInt();
        HashSet<Integer> h2 = new HashSet<>();;
        for(int i=0;i<m;i++){
            h2.add(input.nextInt());

        }
        System.out.println("This is the second hash set");
        System.out.println(h2);
        System.out.println("This is the final set");
        h1.addAll(h2);
        System.out.println(h1);

    }
}
