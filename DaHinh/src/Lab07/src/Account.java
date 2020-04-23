

public abstract class Account{
    protected float balance;
    static int transactions;

    Account(float balance){
        this.balance = balance;
        transactions = 0;
    }
    public void deposit(float amount){
        balance = balance + amount;
        transactions++;
    }
    public  void withdraw(float amount){
        balance = balance - amount;
        transactions++;
    }
    public abstract void endMonthCharge();
    public void endMonth(){
        endMonthCharge();
        System.out.println("So tien con la $"+balance);
        System.out.println("So giao dich trong thang la "+transactions);
        transactions = 0;
    }

    public static void main(String[] args) {
        Account fee = new Fee(5000);
        Account nick = new NickleNDime(1000);
        Account gam = new Gambler(1200);

        fee.deposit(100);
        fee.withdraw(1000);
        fee.endMonth();

        nick.deposit(130);
        nick.withdraw(120);
        nick.withdraw(20);
        nick.endMonth();

        gam.deposit(100);
        ((Gambler) gam).withdraw(110);
        ((Gambler) gam).withdraw(20);
        ((Gambler) gam).withdraw(50);
        gam.endMonth();
    }

}
