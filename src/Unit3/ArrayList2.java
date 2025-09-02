package Unit3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> a2= new ArrayList<>();
        a2.add("A");
        a2.add("b");
        a2.add("C");
        a2.add("d");
        System.out.println(a2);
//        for(String val: a2){
//            System.out.print(val+" ");
//        }
        Collections.sort(a2);
        Iterator<String>it= a2.iterator();

        while(it.hasNext()){ //this is the print of the collection by using the iterator in java

            System.out.print(it.next()+" ");
        }
        System.out.println();

    }
}
