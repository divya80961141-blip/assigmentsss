
public class bankaccount {
private  String accountHolder;
private  String accountNumber;
private double balance ;

public bankaccount(String accountHolder, String accountNumber, double balance){
    this.accountHolder =accountHolder;
    this.accountNumber =accountNumber;
    this.balance =balance;
}
    public void deposite(double amount){
        if(amount > 0){
            balance =balance + amount;
            System.out.println("deposite:" + amount);
        }
    }public void withdraw(double amount){
        if(amount > balance){
            System.out.println("withdrawl failed .insufficient balance");
        }
        else if(amount >0){
            balance = balance - amount;
        }
    }
    public void displaybalance(){
        System.out.println("accountholder:" + accountHolder);
        System.out.println("accountnumber:"  +accountNumber);
        System.out.println("finial balance :" + balance);
    
}
}




