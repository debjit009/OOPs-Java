package Final_Keyword;

public class final_class {
    public static void main(String[] args) {
        arka a1 = new arka();
        a1.smoke();
        
    }
    
}
// class with the final keyword cannot be extends or inherited from other classes. 

class arka extends Sudipto {
    void bark(){
        System.out.println("arka is barking");
    }
}
   final class Sudipto {
    void smoke(){
        System.out.println("Sudipto is smoking");
    }
}
    