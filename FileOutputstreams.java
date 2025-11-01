
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputstreams {
    public static void main(String[] args) {
        //This is the  text we want to write.
        String txt = "Hello World! ";

        //Using try-with resources: it closes the file automatically
        try {
            FileOutputStream fos = new FileOutputStream("1stJavaFile");
            //converts text into raw byte and then write
            fos.write(txt.getBytes());
            System.out.println("Successfully wrote to file.");
        } 
        catch(IOException e ){
            e.printStackTrace();
            System.out.println("Error in writing File.");
        }
    }
}
