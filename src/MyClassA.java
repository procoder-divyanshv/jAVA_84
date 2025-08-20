
public class MyClassA {

    public static void main(String[] args) {

//        A a1= new A(); //definging the object in Class A;
//        A a2= new A();
////        a1.bread= a1.bread-1;
////        System.out.println(A);
//        A.display();
//        A.eat();
//        A.display();
//        A.B obj= new A.B();
//        obj.display();
        B obj= new B();
        obj.display("divyansh");
        obj.display();
    }
    static{ //this static block executes before the main block.
        System.out.println("i am the static block outside the main()");

    }
}

// If we declare a static block then it execute before main this is its prefrence
//after that all the other lines of code runs including main()
// we can make the nested class static not the outer class static.
//Final keyword in java:

