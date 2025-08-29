import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) throws IOException {
        int x,y,z =0;
        DataInputStream dis = new DataInputStream(System.in);;

        Scanner sc =new Scanner(System.in);
        try{
            x=dis.readInt();

            y=dis.readInt();
            z=x/y;
            System.out.println("Exception not occur");

        }
        catch(IOException e){
            System.out.println(e);
        }
//        catch(ArithmeticException e){ //we can give more than one catch block to handle exception
//            System.out.println(e.getMessage());
//
//        }
//        catch(InputMismatchException e){
//            System.out.println(e);
//        }
        finally{
            System.out.println("Result is "+z);
        }


    }


}
