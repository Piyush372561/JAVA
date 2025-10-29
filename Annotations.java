class MorningGreetings{

}
class Greetings extends MorningGreetings{
    public void wish(){
        System.out.println("Good Morning Sir!");
    }
}
public class Annotations {
    public static void main(String[] args){
        Greetings Mg = new Greetings();
        Mg.wish();
    }
}
