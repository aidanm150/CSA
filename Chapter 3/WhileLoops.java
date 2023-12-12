public class WhileLoops{
    public int addOdds(int n){
        int x = 1;
        int sum = 1;
        n=n-1;
        while(n>x){
            x+=2;
            sum+=x;
        }
        return sum;
    }


    public int sumDigits(int x){
        int sum=0;
        int i = 0;
        while(x>0){
            i=x % 10;
            sum=sum+i;
            x=x/10;
        }
        return sum;
    }


    public int howManyYears(double startpop, double endpop){
        int years=0;
        while(startpop<endpop){
            startpop = (startpop * 0.0113)+startpop;
            years++;
        }
        return years;
    }


    public void printSum(int x){
        int n = x;
        int i = 0;
        int sum = 0;
        while((n/x)<x){
            i = n/x;
            n+=x;
            sum+=i;
            System.out.print(i + " + ");
            }
        i=i+1;
        sum=sum+i;
        System.out.println(i + " = " + sum);
    }


    public boolean isPerfectSquare(int n){
        int one = 1;
        while(one<n){
            one+=2;
        }
        if(one==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        WhileLoops ab = new WhileLoops();
        System.out.println("Add Odds");
        System.out.println(ab.addOdds(8));
        System.out.println(ab.addOdds(5));
        System.out.println(ab.addOdds(12));
        System.out.println("Sum Digits");
        System.out.println(ab.sumDigits(320));
        System.out.println(ab.sumDigits(204));
        System.out.println(ab.sumDigits(4037));
        System.out.println("How many Years?");
        System.out.println(ab.howManyYears(111.2, 120));
        System.out.println(ab.howManyYears(111.2, 150));
        System.out.println("Print Sum");
        ab.printSum(6);
        ab.printSum(8);
        System.out.println("Is Perfect Square");
        System.out.println(ab.isPerfectSquare(25));
        System.out.println(ab.isPerfectSquare(49));
        System.out.println(ab.isPerfectSquare(24));
    }
}
