public class WhileLoops{

    public int addOdds(int n){
        int sum=0;
        while(n>1){
            if(n%2==0){
                n--;
            }
            else{
                sum=+n;
                n--;        
            }
        }
        return sum;
    }

    public static void main(String[] args){
        WhileLoops ab = new WhileLoops();
        System.out.println(ab.addOdds(8));
    }
}