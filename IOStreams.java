import java.io.FileInputStream;
import java.io.IOException;
public class IOStreams {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("1stJavaFile.txt");
            int i;

            while((i = fis.read()) != -1){
                System.out.println((char) i);
            }
            fis.close();
        } catch (IOException e) {
                e.printStackTrace(); 
                System.out.println("Error in reading file. ");
        }
    }
} 
