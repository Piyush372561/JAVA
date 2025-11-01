
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputstreams {
    public static void main(String[] args) {
        String txt = "Hello World! ";
        try {
            FileOutputStream fos = new FileOutputStream("1stJavaFile");
            fos.write(txt.getBytes());
            System.out.println("Successfully wrote to file.");
        } 
        catch(IOException e ){
            e.printStackTrace();
        }
    }
}
