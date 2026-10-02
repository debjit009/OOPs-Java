package Anuj_Bhiya.Oops.Inheritance;

public class Inheritance_01 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.bark();
        c1.eat();
        
    }
    
}
class Animal {
      
    void bark(){
        System.out.println("Animal is barking");
    }
    
}
class Cat extends Animal {
    void eat(){
        System.out.println("Cat is eating");
    }
    
}



