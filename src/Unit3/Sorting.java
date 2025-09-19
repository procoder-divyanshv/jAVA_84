package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting  implements Comparable<Sorting>{
    int age;
    String name;
    int roll_no;
    public Sorting(int age,String name, int roll_no){
        this.age=age;
        this.name=name;
        this.roll_no=roll_no;

    }
    public int compareTo(Sorting st){
        if(age>=st.age){
            return 1;

        }
        else{
            return -1;
        }
    }
}
