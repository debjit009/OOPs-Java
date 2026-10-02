package Constructor;

public class constructor_02 {
    public static void main(String[] args) {
    
        Complex num1 = new Complex(2,5);
        Complex num2 = new Complex(7,4);

        num1.print();
        num1.print();
        
    }
    
}
class Complex {
    int a,b;

    // public Complex(){
    //     a = 0;
    //     b = 0;
    // }     ---> it already a default constructors.

    // public Complex(){
    //      a = 7;
    //      b = 9;
        
    // }

    public Complex(int real,int imaginary){
        a = real;
        b = imaginary;

    }

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}
    
