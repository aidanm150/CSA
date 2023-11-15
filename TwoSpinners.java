public class TwoSpinners{

 	public int spin(int min, int max){
     	int result=0;
        result=(int)((Math.random()*max)+min);
    	return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound(){
		int points=0;
        int player=spin(1,10);
        int computer=spin(2,8);
        if(player<computer){
            points-=computer-player;
            System.out.println("You Lose. "+points);
        }
		else if(player>computer){
			points+=player-computer;
			System.out.println("You win! "+points);
		}
		else{
			player+=spin(1,10);
			computer+=spin(2,8);
			if(player>computer){
				points+=player-computer;
				System.out.println("You win! "+points);
			}
			else if(player<computer){
				points-=computer-player;
				System.out.println("You lose. "+points);
			}
			else{
				System.out.println("Tie, no points for anyone.");
			}
		}
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playRound 10 times
         		ds.playRound();
     	      }
 	  }

 }
 
