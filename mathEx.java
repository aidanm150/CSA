public class mathEx {
    public static void main(String [] args){
        int swapped1 = swap(21);
        System.out.println(swapped1);
        
        int swapped2 = swap(123);
        System.out.println(swapped2);

        int swapped3 = swap(1042);
        System.out.println(swapped3);
    }

    public static int swap(int x){
        int r = (x%100);
        int q = x - r;
        int y = (r%10)*10;
        int m = (r/10);
        int k = q + y + m;
        return k;
    }

    public static int timeLeft(int curHour,int curMin,int depHour,int depMin){
        int th = depHour - curHour;
        int tm = depMin - curMin;


    }
}
