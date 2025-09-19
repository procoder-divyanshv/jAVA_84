package Unit3;

//import Unit1.Student;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudent1 {
    public static void main(String[] args) {
        Sorting s1= new Sorting(13,"divyansh",84);
        Sorting s2= new Sorting(13,"divyansh",85);
        System.out.println(s1.compareTo(s2));
        ArrayList<Sorting> a1=new ArrayList<>();
        a1.add(new Sorting(12,"devesh",74));
        a1.add(new Sorting(13,"devesh",64));
        a1.add(new Sorting(42,"devesh",34));
        a1.add(new Sorting(12,"devesh",70));
        a1.add(new Sorting(17,"devesh",7));
        a1.add(new Sorting(10,"devesh",4));
        Collections.sort(a1);
        for(Sorting s3:a1){
            System.out.println(s3.age+" "+s3.name+" "+s3.roll_no); //sorting of the bassis of the age
        }





    }
}
