class MyBanks{
    int accountNumber;
    double balance;

    public MyBanks(int AC,int Bal) {
        this.accountNumber=AC;
        this.balance=Bal;
    }

    
    public void deposit(double Amount){
        balance = Amount + balance;
        System.out.println("Deposited "+Amount+", Your current balance of "+accountNumber+" is "+balance );
    }

    public void withdraw(double Amount){
        
        if(balance<Amount){
            System.out.println("Insufficient balance");
        }else{
            balance=balance -Amount;
            System.out.println("Withdrawn"+" "+Amount+","+" Your current balance is "+balance );
        }
    }

    public void checkbalance(){
        System.out.println("Your current balance for account number "+accountNumber+" is "+balance );
    }
}


public class banking {
    public static void main(String[] args) {
        MyBanks account1 = new MyBanks(101,0);
        MyBanks account2= new MyBanks(102,0);
        account2.deposit(1000);
        account1.deposit(100);
        account1.checkbalance();
        account1.deposit(100);
        account1.deposit(100);
        account1.deposit(100);
        account1.withdraw(200);
        account1.checkbalance();
        account2.withdraw(500);
        account2.checkbalance();
    }
}
