public class Die {
    private int roll;
    
    public Die(){
        roll = 0;
    }
    public void roll(){
        roll =(int)((Math.random()*6)+1);
    }
    public int getNumDots(){
        return roll;
    }
    public static void main(String[] args) {
        Die die = new Die();
        die.roll();
  	  	System.out.println(die.getNumDots());
  	}

}
