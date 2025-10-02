import java.util.Scanner;
class Myexception extends Exception{
    @Override
    public String toString() {
        //return super.toString() +"I am toString()";
        //return "I am toString()";
        return super.toString();
    }
    @Override
    public String getMessage() {
        //return super.getMessage() +"I am getMessage";
       // return  "I am getMessage()";
        return super.getMessage();
    }
    
}
public class exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        if (a<5) {
            try {
                throw new Myexception();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}
