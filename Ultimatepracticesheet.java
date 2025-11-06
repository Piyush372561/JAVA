import java.util.Scanner;
public class Ultimatepracticesheet {
    public static void main(String[] args){
       //Problem-1
       Scanner sc = new Scanner(System.in);

       /*  Taking input 2 numbers.
       System.out.print("Num1: ");
       int num1 = sc.nextInt();
       System.out.print("Num2: ");
       int num2 = sc.nextInt();

       // Process-> adding 2 numbers
       int Sum = num1 + num2;

       // Printing the result
       System.out.println("Sum of "+num1+" and "+num2+" = "+Sum); 

       //PROBLEM 2
       //Taking input
       System.out.print("Variable1: ");
       int Var1 = sc.nextInt();
       System.out.print("Variable2: ");
       int Var2 = sc.nextInt();
       // Declare a VAriable temp
       int temp;
       //Swap to numbers by using an empty Variable
       temp = Var1;
       Var1 = Var2;
       Var2 = temp;
       //Print Var1 and Var2 after Swapping
       System.out.println("Value of Variable 1 after Swapping: "+Var1);
       System.out.println("Value of Variable 2 after Swapping: "+Var2); 

       //PROBLEM 3
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();

       if (n % 2 == 0) {
            System.out.println(n+" is an even number");
       } else {
            System.out.println(n+" is an odd number");
       }     

       //PROBLEM 4 -> REVERSE A NUMBER
       System.out.print("Enter the number: ");
       int numb = sc.nextInt();
       int reversed = 0;
       while(numb != 0){
           int digit = numb % 10;
           reversed = reversed * 10 + digit;
           numb = numb / 10;
       }
       System.out.println("Reversed number: "+reversed);
       

        //PROBLEM 5 -> Area of Rectangle
        System.out.print("Length: "); 
        int l = sc.nextInt();
        System.out.print("Width: "); 
        int w = sc.nextInt();

        int area = l * w;
        System.out.println("Area of rectangle: "+area); */

        //PROBLEM 6 -> sum of the digits
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count <= n){
           sum = sum + count;
           count = count + 1;
        }
        System.out.println("Sum: "+sum);

        //PROBLEM 7 -> CONVERT CELSIUS TO FAHRENHIET
        
    }
}
