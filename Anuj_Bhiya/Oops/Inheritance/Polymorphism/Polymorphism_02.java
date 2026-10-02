package Anuj_Bhiya.Oops.Inheritance.Polymorphism;

public class Polymorphism_02 {
    public static void main(String[] args) {
         Calculator ca = new Calculator();
        ca.add(12,20);
        ca.add(23, 20, 12);
        ca.add(25.5, 24.5);
    }
    
}
class Calculator {
    void add (int a,int b){
        System.out.println("Sum is:="+(a+b));

    }
    void add (int a,int b, int c){
        System.out.println("Sum is:="+(a+b+c));

    }
    void add (double a,double b){
        System.out.println("Sum is:="+(a+b));
    }
}
   
