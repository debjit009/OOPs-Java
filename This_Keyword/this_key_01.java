package This_Keyword;

public class this_key_01 {
    public static void main(String[] args) {
         A a1 = new A();
        System.out.println(a1);
        a1.show();
    }
    
}
class A {

    void show(){
        System.out.println(this); 
        //this keyword refers to current object inside a method or constructor.
    }
    

}
