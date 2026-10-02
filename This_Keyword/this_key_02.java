package This_Keyword;

public class this_key_02 {
    public static void main(String[] args) {
        
        person p1 = new person();
        // System.out.println(p1.name);
    }
    
}
class person {
 
    String name = "Rajesh Roy";
    //output is Rajesh
    //if the properties (Static) then we call using this keyword,
    //like--> static String name = "Rajesh Roy";
    //if context is static then we donot uses this.

    person(){  //Making a constructor
        //System.out.println(this.name);
        this.getdata(); //--> Call this  from constructor
    }
    void getdata(){ //Method
        System.out.println(this.name);
    }
    // static getInfo(){
    //     System.out.println(this.name);//you cannot use this in a static context.

    // }


}

