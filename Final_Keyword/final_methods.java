package Final_Keyword;

public class final_methods {
    public static void main(String[] args) {
         Sudipto s1 = new Sudipto();
        s1.walk();
    }
    
}
  // method with the final keyword cannot be overridden by its sbclasses.
class arka extends Sudipto {
    void walk(){
        System.out.println("arka is walking");
    }
}
class Sudipto {
    final void walk(){
        System.out.println("Sudipto is walking");
    }
}
 

