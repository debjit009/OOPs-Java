package Constructor;

public class constructor_01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
    }
    
}
class Student {
    String name;
    int age;

    Student(){ // consructor name and class name aleays same.
        name = "Debjit";
        age = 20;
    }
    void show() {
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }

    
}
