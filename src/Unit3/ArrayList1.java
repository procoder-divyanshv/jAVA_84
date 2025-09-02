package Unit3;

import java.util.ArrayList;

public class ArrayList1 {//using the collection in the java
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(12);
        a1.add(15);
        a1.add(19);
        a1.add(31);
        a1.add(30);
        System.out.println(a1);
        for(int al1:a1){  //this is called the for each loop
            System.out.print(al1+" ");

        }
        System.out.println();


    }
}
