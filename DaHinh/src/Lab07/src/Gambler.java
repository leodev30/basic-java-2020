import java.util.Random;

public class Gambler extends Account{
    Gambler(float balance) {
        super(balance);
    }

    @Override
    public void withdraw(float amount) {
        Random rn = new Random();
        double d = rn.nextDouble();//từ 0 đến 1
        System.out.println(d);
        if(d<=0.49){
            balance = balance - 0 * amount;
            transactions++;
        } else{
            balance = balance - 2 * amount;
            transactions++;

        }

    }

    @Override
    public void endMonthCharge() {
        balance = balance - 5;
        transactions++;
    }
}
