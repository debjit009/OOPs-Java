package Super_Keyword;

public class super_key_01 {
    public static void main(String[] args) {
         Dog d1 = new Dog();
        d1.doSomething();
    }
    
}
class Animal {
    Animal(){ //Create a Constructor
        System.out.println("Animal is runing");

    }

    int age = 3;
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    Dog(){
        super();
    }
    void doSomething(){
        this.sleep();
        System.out.println(super.age);
    }
    
}


