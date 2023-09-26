public class mathEx {
    public static void main(String [] args){
        int swapped1 = swap(21);
        System.out.println(swapped1);
        
        int swapped2 = swap(123);
        System.out.println(swapped2);

        int swapped3 = swap(1042);
        System.out.println(swapped3);

        timeLeft(1,34,8,20);

        timeLeft(1,15,4,36);

        int dayOne = dayOfWeek(0, 1);
        System.out.println(dayOne);

        int dayTwo = dayOfWeek(0,14);
        System.out.println(dayTwo);

        int dayThree = dayOfWeek(6,22);
        System.out.println(dayThree);

        int dayFour = dayOfWeek(5,4);
        System.out.println(dayFour);
    }

    public static int swap(int x){
        int r = (x%100);
        int q = x - r;
        int y = (r%10)*10;
        int m = (r/10);
        int k = q + y + m;
        return k;
    }

    public static void timeLeft(int curHour,int curMin,int depHour,int depMin){
        int tHour = ((depHour*60)+depMin) - ((curHour*60)+curMin);
        int tMin = tHour % 60;
        int trHour = tHour / 60;
        System.out.println(trHour+" Hours and "+tMin +" minutes.");
    }

    public static int dayOfWeek(int dOfJanOne, int dOfMonth){
        int weekNum = (dOfJanOne + dOfMonth - 1) % 7;
        return weekNum;
    }

}
