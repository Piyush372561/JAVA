import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class IOStreams {
    
    public static void main(String[] args){
        System.out.println("Java is running in this folder:");
        System.out.println(System.getProperty("user.dir")); // <-- current working directory
        
        File file = new File("1stJavaFile.txt");
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File exists? " + file.exists());
        
        
        System.out.println(new java.io.File("1stJavaFile.txt").getAbsolutePath());

        try(FileInputStream fis = new FileInputStream("C:\\Users\\kushw\\OneDrive\\Desktop\\CODING\\JAVA\\1stJavaFile.txt")) {
            int i;
            while((i = fis.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
                e.printStackTrace(); 
                System.out.println("Error in reading file. ");
        }
    }
} 
