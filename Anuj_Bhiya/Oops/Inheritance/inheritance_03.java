package Anuj_Bhiya.Oops.Inheritance;

public class inheritance_03 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Arka";
        h1.age = 21;
        h1.Sleep();

        Human h2 = new Human();
        h2.name = "Sudipto";
        h2.age = 20;
        h2.Run();
        
    }
    
}
class Human {
    String name;
    int age;
    int bones;

    void Sleep(){
        System.out.println(name+" is " +age+ " years and he is sleeping");

    }
    void Run(){
        System.out.println(name+" is "+ age+ " years and he is runing");
    }
   
}


    

