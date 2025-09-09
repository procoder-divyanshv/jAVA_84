package Unit3;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v1 =new Vector<>(3,5);
        v1.add("divyansh");
        v1.add("mayank");
        v1.add("Aakash");
        v1.add("String");
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        for(String i: v1){
            System.out.print(i+" ");

        }
        System.out.println();




        //this data structure is used to make multi-threaded application because it is thread-safe.
        //this degrade the performance as it is syncronised thus this is slower than ArrayList due to this feature in it.
        //this support both iterator and Enumeration.


    }
}
