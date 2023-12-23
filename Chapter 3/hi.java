public class hi{
    private boolean IsEven(int presents){
        if(presents == 1||presents==3||presents==5||presents==7||presents==9||presents==11){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        hi ab = new hi();
        System.out.println(ab.IsEven(2));
    }
}
