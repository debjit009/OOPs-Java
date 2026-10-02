package Super_Keyword;

public class super_02 {
    public static void main(String[] args) {
        Dog d1 = new Dog();

       d1.doSomethings();
       d1.what();
       d1.eat();
    }
}
class Animal {

     Animal(){
        System.out.println("Animal constructor");
     }
     
    String name = "Simba";

    void walk(){
        System.out.println("Animal is walking");
    }
    void sleep(){
        System.out.println("The animal is sleeping");
    }
    void eat(){
        System.out.println("The animal is eating grass");
    }
}
class Dog extends Animal {
      Dog(){
          super();
      }
       void doSomethings(){
           super.walk();

       }
       void what(){
           super.sleep();
           System.out.println(super.name);
       }
       void something(){
          super.eat();
       }

}
    