//public class A {
//    static int bread= 10;
//    public static void display()
//    {
//        System.out.println("Slice remaining: "+bread);
//    }
//    public static void eat(){
//        System.out.println("Eating");
//        bread= bread-1;
//    }
//}
public /*final*/ class A{ //similarly we cannot inherit any class from this final class.

        public final void display(){ //after this final keyword anyone cannot overwrite the method.
            System.out.println("i am a nested class B");
        }

}