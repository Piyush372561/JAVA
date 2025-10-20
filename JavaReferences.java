public class JavaReferences {
    public static void main(String[] args){
        String str = "Piyush";
        System.out.println("My name is "+str);
        //Java References
        System.out.println(str.charAt(4));
        System.out.println(str.codePointAt(2));
        System.out.println(str.codePointBefore(2));
        System.out.println(str.codePointCount(0,5));
        System.out.println(str.compareTo("P"));
        System.out.println(str.compareToIgnoreCase("P"));
    }
}
