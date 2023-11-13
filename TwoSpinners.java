public class TwoSpinners{
 	public int spin(int min, int max){
     	int result=0;
        result=(int)((Math.random()*max)+min);
    	return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound(){
        public int pPoints = 0;
        int player=spin(1,10);
        int computer=spin(2,8);
        if(player<computer){
            pPoints+=computer-player;
            System.out.println("You Lose.");
        }
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playRound 10 times
         		ds.playRound();
     	      }
 	  }

 }
 
