public class SpecialCheckingAccount extends CheckingAccount {
    private int minimum;
    private int nterest;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double min, double interestRate){
        super(idNumber, startBal, cc);
        nterest = interestRate;
        minimum = min;
    }
    public void clearCheck(double amnt){
        if(currentBalance()>=minimum){
            decreaseBalance(amnt);
        }
    }
    public double monthlyInterest(){
        return (annual*currentBalance())/12;
    }
}
