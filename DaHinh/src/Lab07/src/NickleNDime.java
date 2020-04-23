public class NickleNDime extends Account{
    protected int withdrawCount;
    NickleNDime(float balance) {
        super(balance);
    }

    @Override
    public void endMonthCharge() {
        balance = balance - 5 -  withdrawCount* ((float) 0.5);
        transactions++;
    }

    @Override
    public void withdraw(float amount) {
        super.withdraw(amount);
        withdrawCount++;

    }
}
