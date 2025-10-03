/ Practice sheet 5 -> LOOPS.


// Question -> 3,4
/*
import java.util.*;
public class Program_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the required number: ");
        int n = sc.nextInt();
        
        int table = 0;
        for(int i = 10; i >= 1;i--){
             table = n * i;
            System.out.println(n+" X "+i+" = "+table);
        }
    }
} */
//Question 5
/*
import java.util.*;
public class Program_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int factorial = 1;
        for(int i = n; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " +n+ " is " +factorial);
    }
} */
// Question 6 -> repeat 5 using while loop.
// galat code hai ye 👇
/*
import java.util.*;
public class Program_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 5;
        while(i == num){
            System.out.println(i);
        }
    }
} */
