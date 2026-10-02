package Inner_Class;

public class inner_class {

        class Toy { //--> non static
        int price;
    }
    static class book {
        int price;
    }

    public static void main(String[] args) {
        //Toy t1 = new LearInnerClass().new Toy();
        inner_class obj = new inner_class();
        Toy t1 = obj.new Toy();
        t1.price = 50;

        book book = new inner_class.book();
        book.price = 100;


    }
}
    

}
    
