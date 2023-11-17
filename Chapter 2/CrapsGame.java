// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;
  private int result = 0;
  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
    if(total==2){
      result=-1;
      System.out.println("You rolled a 2. Game Over :(");
    }
    else if(total==3){
      result=-1;
      System.out.println("You rolled a 3. Game Over :(");
    }
    else if(total==12){
      result=-1;
      System.out.println("You rolled a 12. Game over :(");
    }
    else if(total==7){
      result=1;
      System.out.println("You rolled a 7. You win :D");
    }
    else if(total==11){
      result=1;
      System.out.println("You rolled an 11. You win :D");
    }
    else{
      result=0;
      point=total;
      System.out.println("Game Continues. Roll Again.");
    }
    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}
