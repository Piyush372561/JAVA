// Methods In JAVA

//Example program 1
/*
package com.company;

import java.util.*;
public class Method_Program1{
    static int logic(int x, int y){
        int z = x+y;
        return z;
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = logic(a,b);
        System.out.println("The Sum of " + a + " + " + b + " is " +c);
    }
} */

/*
package com.company;

import java.util.*;
public class Method_Program1{
        int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //method calling by object creation
        Method_Program1 obj = new Method_Program1();
        int c = obj.logic(a,b);
        //direct method calling 
        int c = logic(a,b);
         System.out.println("The result is: " +c);
        int a1 = 4; 
        int b1 = 3;
        int c1 = obj.logic(a1 ,b1);
        //int c1 = logic(a1,b1);
        System.out.println("The result is: " +c1);
    }
}  */

 // self made programs simple 
 /*
 package com.company;
   
   import java.util.*;
   public class Program_2{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        int D1 = Division(num1,num2);
        
        System.out.println("The Division looks like this: " +D1);
        
        //Addition
        //int sum = Addition(num1,num2);
        //System.out.println("The Subtraction of two numbers is: " +Diff);
        
        // Difference
        //int Diff = Subtraction(num1,num2);
        //System.out.println("The Subtraction of two numbers is: " +Diff);
         int num3 = 24;
         int num4 = 12;
         int D2 = Division(num3,num4);
         
         System.out.println("The Division looks like this: " +D2);
        
       }
       static int Division(int dig1,int dig2){
           return dig1/dig2;
        //return num1 + num2;
        //return num1 - num2;
       }
   } */
   
    
    // Example of an ARRAY
    
/*package com.company;

import java.util.*;
 public class Main1 {
    public static void main(String[] args) {
        // changing integer -> isme integer copy hoga.iska mtlb hai ki yaha toh i = 19 iske baad 19 ki ek or copy bnegi jo x1 me store hogi
        int i = 19;
        change_integer(i);
        System.out.println("The value of i after changing the integer. " +i);
        // changing array -> isme reference copy hoga. Mtlb Arr or x dono ek hi array ko point out kr rhe hai 
        int[] Arr = {2,4,6,8,10};
        change_arrey(Arr);
        System.out.println("The value of array[0] is: " +Arr[0]);
    }
     static void change_integer(int x){
        x = 91;
    } 
    static void change_arrey(int[] x){
        x[0] = 1;
    }
} */

