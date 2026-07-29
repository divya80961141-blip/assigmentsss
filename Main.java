

public class Main{
    
public static void main(String[] args){
    bankaccount acc1 =new bankaccount("divya",  "987654321", 10000);
    acc1.deposite(2000);
    acc1.withdraw(1000);
    acc1.withdraw(20000);
    acc1.displaybalance();
}
}
