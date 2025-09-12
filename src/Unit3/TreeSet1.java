package Unit3;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts1= new TreeSet<>();
        ts1.add("bb");
        ts1.add("aa");
        ts1.add("cc");
        //this TreeSet do not support the addFirst and addLast as these functions are available in the LinkedList.

        System.out.println(ts1);

    }
}
