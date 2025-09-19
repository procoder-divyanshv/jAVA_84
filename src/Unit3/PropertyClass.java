package Unit3;

import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;
public class PropertyClass {
    public static void main(String[] args) {
        try{
            FileReader fr =new FileReader("");
            Properties p=new Properties();;
            p.load(fr);
            String name=p.getProperty("name");
            String age=p.getProperty("age");
        }
        catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
