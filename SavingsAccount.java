public class SavingsAccount extends Account{
    private double annual;
    public SavingsAccount(int id, double bal, double ann){
        super(id, bal);
        annual = ann;
    }
    public boolean withdraw(double amt){
        if(amt>=currentBalance()){
        decreaseBalance(amt);
        return true;
        }
        else{return false;}
    }
    public double monthlyInterest(){
        return (annual*currentBalance())/12;
    }
}