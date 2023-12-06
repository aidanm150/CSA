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

    public int sumDigits(int x){
        int i = 10;
        int sum=0;
        while(x!=0){
            x=x%i;
            i = i*10;
            sum=sum+x;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(addOdds(8));
        System.out.println(10/100);
    }
}