package Inner_Class;

public class Interface {
    public static void main(String[] args) {
         dog d1 = new dog();
         d1.eats();
         d1.walk();
         d1.drink();

        System.out.println(Animal.legs);

    }
}
interface pet {
    void walk();
    void drink();


}

interface Animal {
    int legs = 4;

    void eats();
    void drink();

    default void bark(){
        System.out.println("Animal is barking");
    }

}
class dog implements Animal,pet{

    @Override
    public void eats() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Pet is walking");
    }
    @Override
    public void drink() {
        System.out.println("pet is drinking");

    }
}
    