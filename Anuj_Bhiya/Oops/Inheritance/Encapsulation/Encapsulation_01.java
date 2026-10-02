package Anuj_Bhiya.Oops.Inheritance.Encapsulation;

public class Encapsulation_01 {
    public static void main(String[] args) {
        
         Boy b1 = new Boy();
        b1.setName("Debjit");
        b1.setRollnumber(9);
        b1.setAge(21);
        
        System.out.println(b1.getName());
        System.out.println(b1.getRollnumber());
        System.out.println(b1.getAge());
        
    }
    
}
class Boy {
    //properties/fields/instance variable & behaviour
    private String name; // instance variable 
    private int age;
    private int rollnumber;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 20){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
             this.age = age;
            
            }
        
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}
  


    

