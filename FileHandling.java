import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        //Code to create a File.
        File myfile = new File("1stJavaFile");
        try {
          myfile.createNewFile(); 
        } 
        catch (Exception e) {
          e.printStackTrace();
        }

        //Code to Write a File.
        try {
            FileWriter myFilewriter = new FileWriter("1stJavaFile");
            myFilewriter.write("Hello! EveryOne.\n");
            myFilewriter.write("My name is Piyush Kushwaha.\nI am your Java teacher.");

            myFilewriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //Code to read a file
        try {
            File myFile = new File("1stJavaFile");
            Scanner sc = new Scanner(myFile);

            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
           
        //Code to Delete a file.
        /* 
        File MynewFile = new File("1st Java File");
        if (MynewFile.delete()) {
            System.out.println("I have deleted my file. "+MynewFile.getName());
        } else{
            System.out.println("Some Problems Occured in Deleting a file.");
        }
          */
        
    }
}
