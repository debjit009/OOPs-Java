package Final_Keyword;

public class final_key {
    public static void main(String[] args) {
        final int age = 21;
        //variable with final keyword cannot be assigned again.
        //age = 24; --> error
        System.out.println(age);

        c c1 = new c();
        c1.call();
    }
    
}
  
     final class a { // final keyword
     void call(){
        System.out.println("so a call b");

    }
}
class c extends a {  // error 
    void call(){
        System.out.println("so c call d");
    }

}

    