import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdRW {
    public static void main(String[] args) {
        try(BufferedReader BR = new BufferedReader(new FileReader("Question1.txt"))){
            String line;

            while((line = BR.readLine()) != null){
                System.out.println(line);
            }
        } 
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error Occurs While Reading. ");
        }
    }
}
