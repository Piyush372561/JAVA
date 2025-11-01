
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

        //Question -> 1
        String name = "Piyush Kushwaha.\n";
        int index = 69;
        String branch = "Data Science\n";
        String college = "SRGI";

        try {
            FileOutputStream fos1 = new FileOutputStream("Question1.txt",true);
            fos1.write(("Name: "+name).getBytes());
            fos1.write(("Roll no.= "+String.valueOf(index)).getBytes());
            fos1.write("\n".getBytes());
            fos1.write(("Branch: "+branch).getBytes());
            fos1.write(("College: "+college).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
