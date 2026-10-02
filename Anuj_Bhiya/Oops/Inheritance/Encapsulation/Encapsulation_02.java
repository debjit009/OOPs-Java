package Anuj_Bhiya.Oops.Inheritance.Encapsulation;

public class Encapsulation_02 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposite(-10);
        ba.withdraw(10);
        ba.deposite(100);
        ba.withdraw(10);
        System.out.println(ba.getBalance());

        
    }
    
}
class BankAccount {
    Long AccountNumber;
    double  balance;

 
    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite:" + amount);

        }else{
            System.out.println("Invalid deposite amount");
        }
          
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrew" + amount);

        }else{
            System.out.println("invalid amount");
        }

    }

    public Long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
}

