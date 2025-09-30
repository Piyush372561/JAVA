// Pratice sheet 2

//Question - 1
/* 
  import java.util.*;
  public class TestProgram_1{
    public static void main(String[] args){
        byte x = 10;
         byte y = 11;
         byte z = (byte)(x+y); 
         char ch = 'a';
         char ch2 = 'b';
         System.out.println('a'+'b');
        
        System.out.println(z);
        System.out.println(b);
    }
} 

// Question - 2
*/
//write the expressions in java:
// 1. a*b-d
/* import java.util.*;
public class Program_1{
    public static void main(String[] args){
       int a = 7;
       int b = 7;
       int d = 10;
       int result = a * b - d;
       System.out.println(result);
    }
} */

// 2.
//v^2 - u^2
/*
import java.util.*;
public class Program_2{
    public static void main(String[] args){
       int u = 7;
       int v = 7;
       int result1 = (int)Math.pow(v,2) - (int)Math.pow(u,2);// ye tarika hai square krne ka 
       int result = (v*v) - (u*u);// ya fir isse aise kro 
       System.out.println(result1);
       System.out.println(result);
    }
} */

//3.
// (x - y)/2
/*
import java.util.*;
public class Program_3{
    public static void main(String[] args){
        double x = 10;
        double y = 5;
        double result = (x-y)/2;
        System.out.println(result);
    }
} */

//4. 
//(b^2 - 4*a*c)/2a;
/*
import java.util.*;
public class Program_4{
    public static void main(String[] args){
        double a = 6;
        double b = 8;
        double c = 10;
        double result = ((b*b) - (4*a*c))/(2*a);
        System.out.println(result);
    }
} */

//5. 
/*
import java.util.*;
public class Program_5{
    public static void main(String[] args){
        float a = 7/4 * 9/2;
        System.out.println(a);
    }
} */

//6.
/*
import java.util.*;
public class Program_6{
    public static void main(String[] args){
        int ch = 8;
        char g1 = 'A';
        
        char EncryptedGrade = (char)(g1 + ch);
        System.out.println(EncryptedGrade);
        
        char DecryptedGrade = (char)(EncryptedGrade - ch);
        System.out.println(DecryptedGrade);
    }
}
*/

/* 7. use comparison operators to find whether a given number is greater than the user entered number or not.
import java.util.*;
public class Program_6{
    public static void main(String[] args){
        int num1 = 10;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num2 = sc.nextInt();
        
        if(num1>num2){
            System.out.println("The given no. is greater than the entered no.");
        }else if(num2>num1){
            System.out.println("The entered no. is greater than the given no.");
        }else{
            System.out.println("Both numbers are same ");
        }
    }
} */

/* 8.write the following expression in java:
/(v^2 - u^2)/2as
 import java.util.*;
 public class Program_7{
    public static void main(String[] args){
        double a = 2;
        double s = 4;
        double u = 12;
        double v = 18;
        double result = ((v*v) - (u*u))/(2*a*s);
        System.out.println("The solution of the following expression will be " +result);
    }
} */
 
//7. use comparison operators to find whether a given number is greater than the user entered number or not.
/*import java.util.*;
public class Program_6{
    public static void main(String[] args){
        int x = 7;
        int a = 7 * 49 / 7 + 35 / 7;
        System.out.println("The value of a: " +a);
    }
} */
