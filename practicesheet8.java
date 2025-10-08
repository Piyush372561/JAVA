//OOps concept

/* class GetSet{
    private String naam;
    private int id;
    private int salary;

    public int getSalary(){
        return salary;
    }
    //Quiz overload a constructor to initialize salary of rs.10,000
    public GetSet(){
     salary = 10000;
    }

    public String getNaam(){
        return naam;
    }
    public void setName(String n){
     this.naam = n;
    }

    public int getId(){
    return id;
    }
    public void setId(int i){
      this.id = i;
    }
}
// Q-2 -> circle ke radius ko set karo or circle ke area ko set karo or circle ke perimeter ko set karo agar aap galat set kr rhe ho toh vo aapko warning dega?
 class Circle{
    private int radius;
    private int area;
    private int perimeter;
    //CONSTRUCTORS
    //Non parameterize
    public Circle(){
        this.radius = 5;
        this.area = 9;
        this.perimeter = 42;
    }
    //Parameterize Constructors
    public Circle(int r,int a,int p){
    this.radius = r;
    this.area = a;
    this.perimeter = p;
    }
    
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){//radius set
     this.radius = r;
    }

    public int getArea(){
        return area;
    }
    public void setArea(int a){//area set
     this.area = a;
    }

    public int getPerimeter(){
        return perimeter;
    }
    public void setPerimeter(int p){//perimeter set
    this.perimeter = p;
    }
} 
//Practice Questions
//Question One
class Cylinder{
    private int radius;
    private int height;
    // Question three bss pehle setter ko comment out kr dena
    public Cylinder(){
    radius = 12;
    height = 10;
    }
    // ye cheez mat krna tum assign nhi kr rhe ho tumhe find krna hai area or perimeter
    //double area;
    //double perimeter;
    //radius
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    //height
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    public double areaofCylinder(){
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }
    public double volumeOfCylinder(){
        return 3.14 * radius * radius * 2 * height;
    }
}

//Question Four
class Rectangle{
    int length;
    int breadth;

    public Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
}

//Question Five 
class Sphere{
    private int radius;
    private int height;
    
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    //height
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }  
}

public class accessmod{
    public static void main(String[] args) {
    //Getter and setter

    // Q-1
    GetSet k = new GetSet();
    k.setName("Piyush");
    System.out.println(k.getNaam());

    k.setId(32);
    System.out.println(k.getId());
    //Quizz question 
    System.out.println("Salary: "+k.getSalary());

    // Q-2
    Circle c = new Circle(5,12,6);
    c.setRadius(5);
    System.out.println("Radius of circle: "+c.getRadius());//radius call or print hogya.

    c.setArea(78);
    System.out.println("Area of Circle: "+c.getArea());//area call or print hogya.

    c.setPerimeter(31);
    System.out.println("Perimeter of Circle: "+c.getPerimeter());//perimeter call or print hogya. 

    //Practice Questions
    //Question one
    Cylinder cy = new Cylinder();
    //cy.setRadius(5);
    //cy.setHeight(6);
    System.out.println("Radius of a Cylinder: "+cy.getRadius());
    System.out.println("Heightof a Cylinder: "+cy.getHeight());

    //Question two 
    //Surface area - A=2πr (h+r).
    // Volume - V = πr2h.
    System.out.println("Area of Cylinder: "+cy.areaofCylinder());
    System.out.println("Volume of Cylinder: "+cy.volumeOfCylinder());
    
    //Question four
    Rectangle r = new Rectangle(12,10);
    System.out.println("length of a Rectangle: "+r.length);
    System.out.println("breadth of a Rectangle: "+r.breadth);
    
    // Question Five
    Sphere s = new Sphere();
    s.setRadius(5);
    s.setHeight(6);
    System.out.println("Radius of a Sphere: "+s.getRadius());
    System.out.println("Heightof a Sphere: "+s.getHeight());
    }
} */
