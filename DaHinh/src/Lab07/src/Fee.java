public class Fee extends  Account{
    Fee(int balance) {
        super(balance);
    }

    @Override
    public void endMonthCharge() {
        balance = balance - 5;
        transactions++;
    }
}
