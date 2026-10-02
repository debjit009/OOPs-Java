package Anuj_Bhiya.Oops.Inheritance.Polymorphism;

public class Polymorphism_01 {
    public static void main(String[] args) {
         Animal a1 = new Animal();
        a1.bark();
    }
    
}
class Animal {
    void bark(){
        System.out.println("Animal is barking");
    }

}
class Cat extends Animal {
    void bark(){
        System.out.println("Cat is barking");
    }
}
    

