//Practice sheet 3

// Basic string Program PRACTICE SHEET 3
/*
import java.util.*;
public class string_Program1{
    public static void main(String[] args){
        
        String str = "Piyush";
        
        System.out.println(str.length());//o/p=6
        
        System.out.println(str.toLowerCase());//o/p=piyush
        
        System.out.println(str.toUpperCase());//o/p=PIYUSH
        
        System.out.println(str.trim());//o/p=Piyush
        
        System.out.println(str.substring(3));//ush
        
        System.out.println(str.substring(0,3));//Piy
        
        System.out.println(str.replace('P','T'));//Tiyush
        
        System.out.println(str.startsWith("Pi"));//true
        
        System.out.println(str.endsWith("sh"));//true
        
        System.out.println(str.charAt(4));//s
        
        System.out.println(str.indexOf('i'));//1
        
        System.out.println(str.indexOf("u",3));//3
        
        System.out.println(str.lastIndexOf("s"));//4
        
        System.out.println(str.lastIndexOf("s",2));//-1
         
        System.out.println(str.equals("Piyush"));//true
          
        System.out.println(str.equalsIgnoreCase("piyush"));//true
    }
} */
// 
 /* 
 import java.util.*;
public class Program_2{
    public static void main(String[] args){
        String name = "Piyush";
        System.out.println(name.toLowerCase());
    }
} */
//
/*
import java.util.*;
public class Program_2{
    public static void main(String[] args){
        String name = " P i y u s h ";
        System.out.println(name.replace(' ','_'));
    }
} */
//W a p in java to fill in the letter template which looks like below
//letter = "Dear <|name|>, Thanks a lot";
// replace <|name|> with a string (some name)
/*
import java.util.*;
public class Program_2{
    public static void main(String[] args){
        String letter = "Dear <|name|>, Thanks a lot";
        String name = "Piyush";
        System.out.println(letter.replace("<|name|>","Piyush"));
    }
} */
// Question ->4 detect double and triple spaces.
/*
import java.util.*;
public class Program_5{
    public static void main(String[] args){
        String str = " Hi! Piyush you are  looking cute and   Hot";
        System.out.println(str.indexOf("  "));
         System.out.println(str.indexOf("   "));
    }
} */
//w a p in java to format the following letter using escape sequence characters 
// letter = "Dear Piyush, Thanks for visiting our store."
/*
import java.util.*;
public class Program_2{
    public static void main(String[] args){
        String letter = "Dear Piyush,\n\t Thanks for visiting our store.";
        System.out.printf(letter);
    }
} */
