import java.util.Scanner;
public class errorsdemo{
    public static void main(String[] args){

        //Syntax Error
        //int a = 10 -> missing semicolon
        //a = 5; -> undeclared variable

        //Logical Errors Demo
        //W A P to print all prime numbers between 1 to 10;
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");

    
        for(int i = sc.nextInt();i<+5;i++){
            System.out.println(2*i+1);
        } */

        // Runtime Error
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int p = sc.nextInt();
        int a = 14;
        System.out.println(a + p); 
         System.out.println("Enter2: ");
        int k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k); */

    // EXCEPTIONS
        int a = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("The Result is: "+c);
        } catch (Exception e) {
            System.out.print("Reason: ");
            System.out.println(e);
        }




    }
}