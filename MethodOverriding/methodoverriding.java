package MethodOverriding;

public class methodoverriding {
    public static void main(String[] args) {
          emp e1 = new emp();
        e1.getlogin();
        
    }
    
}
class user {
    void getlogin(){
        System.out.println("user login");

    }
    void logout(){
        System.out.println("user logout");
    }

}
class emp extends user {
    void getlogin(){
        System.out.println("emp login");
    }
     
}