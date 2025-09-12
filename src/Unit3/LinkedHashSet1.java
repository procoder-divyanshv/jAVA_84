package Unit3;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1= new  LinkedHashSet<String>(10);
        lhs1.add("David");
        lhs1.add("Charlie");

        lhs1.add("Charlie"); //this will not be added to the LinkedHashSet as it is duplicate but the order is maintained.

        System.out.println(lhs1);
         //the arrow function in the JavaScript is called Lambda function in Java.
    }
}
