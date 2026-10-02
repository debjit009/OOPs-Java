package Anuj_Bhiya.Oops.Inheritance.Anonymous;

public class anonymous {
     Outerclass obj = new Outerclass(){
        void walk(){
            System.out.println("Walking...");
        }
        public void sleep(){
            System.out.println("Sleeping...");
        }
    };
    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {


        }
    };
    SuperInterface obj3 = () -> {

    };

     public static void main(String[] args) {
        WalkAble walkAble = (int steps) -> {
        System.out.println("Walked"+steps+"steps");
        return steps;

    };
    walkAble.walks(10);
}


}
interface WalkAble {
    int walks(int steps);
}

class Outerclass {
    public void OuterMethod(){
        
    }

}
@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
      //void fly();

}
    


    

