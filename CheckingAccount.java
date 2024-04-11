
public class CheckingAccount extends Account{

	private double checkCharge;
	
	public CheckingAccount(int idNumber, double startBal, double cc){
		super(idNumber, startBal);
		checkCharge = cc;
	}

	public void clearCheck(double amount){
		decreaseBalance(amount + checkCharge);
	}
	public double monthlyInterest() {
		// TODO Auto-generated method stub
		return 1.0;
	}

}