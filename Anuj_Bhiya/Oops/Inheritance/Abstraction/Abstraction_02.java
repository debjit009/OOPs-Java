package Anuj_Bhiya.Oops.Inheritance.Abstraction;

public class Abstraction_02 {
     public static void main(String[] args) {
        Bike b1 = new UpdatedScotter();
        b1.drive();
        b1.brake();
        b1.fly();
        
    }
}
abstract class Bike {
    public abstract void drive();
    public abstract void fly();
        
    
    public void brake(){
        System.out.println("Bike break suddenly");

    }

}
abstract class Scotter extends Bike {
    // public void fly(){
    //     System.out.println("Flying...");
    // } 
    public void drive(){
        System.out.println("Driving...");
    }
}
class UpdatedScotter extends Scotter { // concrete class

    @Override
    public void fly() {
       System.out.println("Flying...");

    
    }
     
}

    

