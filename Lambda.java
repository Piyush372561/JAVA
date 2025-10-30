interface DemoAno{
    void meth1(String s1, String s2);
    //void meth2();
}
//class AnonyDemo implements DemoAno{
//    public void Display(){
  //      System.out.println("Hello!");
    //}
    //@Override
//    public void meth1(){
//        System.out.println("Method 1");
//    }
//    @Override
//    public void meth2(){
//        System.out.println("Method 2");
//    }
//}
public class Lambda {
    public static void main(String[] args) {
        //AnonyDemo Ad = new AnonyDemo();
        //Ad.meth1();

        //DemoAno dm = new AnonyDemo();
        //dm.meth2();

        //ANONYMOUS CLASS -> This is an unnamed class which we use for once.

        /*DemoAno obj = new DemoAno() {
        @Override
        public void meth1(){
            System.out.println("I am Method1");
        }   

        @Override
        public void meth2(){
            System.out.println("I am Method2");
        }
    };
    obj.meth1(); */
        //LAMBDA EXPRESSIONS
        DemoAno dm = (s,s2)->{ System.out.println("My name is Piyush "+s+" String: "+s2);};
        dm.meth1("Kushwaha","First name");
  }
}
