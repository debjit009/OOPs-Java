package Anuj_Bhiya.Oops.Inheritance;

public class inheritance_02 {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.name ="Billu";
        c1.walk();

        Cat c2 = new Cat();
        c2.name ="Tom";
        c2.sit();

        
    }
    
}
class Cat {  //factory
    String name;
    int age;
    String color;  //all this are properties

    void walk(){
        System.out.println(name+" is walking");

    }
    void sit(){
        System.out.println(name+" is sitting");
    }

}

    
