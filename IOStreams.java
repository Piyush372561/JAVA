import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class IOStreams {
    
    public static void main(String[] args){
        System.out.println("Java is running in this folder:");
        System.out.println(System.getProperty("user.dir")); // <-- current working directory
        
        File file = new File("Question1.txt");
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File exists? " + file.exists());
        
        
        System.out.println(new java.io.File("Question1.txt").getAbsolutePath());

        try(FileInputStream fis = new FileInputStream("Question1.txt")) {
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
                e.printStackTrace(); 
                System.out.println("Error in reading file. ");
        }
    }
} 
