import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "You entered the wrong id password and id name.";
       // return "I am toString()";
       // return super.toString(); 
    }
    @Override
    public String getMessage() {
       return super.getMessage() + "Now you have only one chance to unlock your phone. if you fail this time your phone get locked for the next 20 mins ";
      // return "I am getMessage() ";
      //  return super.getMessage();
    } 
}
public class exception {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        a = sc.nextInt();
       if(a<99){
        try {
            //throw new MyException();
            throw new ArithmeticException("This is an Arithmetic Exception.");
        } catch (Exception e) {
            System.out.println(e. getMessage());
            System.out.println(e. toString());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Finished");
       }
    }
}
