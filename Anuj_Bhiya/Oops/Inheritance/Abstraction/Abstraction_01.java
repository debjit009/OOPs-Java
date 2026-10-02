package Anuj_Bhiya.Oops.Inheritance.Abstraction;

public class Abstraction_01 {
    public static void main(String[] args) {
          //vehicle v1 = new Vehicle();
    car c1 = new car();
    c1.accelarate();
    c1.brake(4);
    c1.light();
}
    
}
abstract class Vehicle {
   abstract void accelarate();
   abstract int brake(int wheels);

   void light(){   //without abstract method 
      System.out.println("Vehicle light");
   }

}
class car extends Vehicle {

   
    void accelarate(){
        System.out.println("car is accelarateing");

    }

    int brake (int wheels){
        System.out.println("car brakes are push");
        return wheels;

    }

    void light(){
        System.out.println("car light");
    }
     
}

