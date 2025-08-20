public class Student {
    int roll_no; //these are instance variable defined in this field
    String name;

    Student(int r,String n){ //this is the constructor in the java. if there are more than one constructor then it is said to be constructor overloading.

        roll_no = r;
        name=n;


    }
    //there are two types of constructor 1. Default 2. parameterized

    public void display() {
        System.out.println("Roll No : "+roll_no+"\nName : "+name);
    }




}
