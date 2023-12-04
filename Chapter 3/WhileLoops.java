public class WhileLoops{

    public static int addOdds(int n){
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
        int sum1 = addOdds(3);
        int sum2 = addOdds(5);
        int sum3 = addOdds(8);
        System.out.println(sum1 + sum2 + sum3);
    }
}