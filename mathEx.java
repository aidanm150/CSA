public class mathEx {
    public static void main(String [] args){
        int swapped1 = swap(21);
        System.out.println(swapped1);
        
        int swapped2 = swap(123);
        System.out.println(swapped2);
    }

    public static int swap(int x){
        int r = (x%100);
        int q = x - r;
        int y = (r%10)*10;
        int m = (r/10);
        int k = q + y + m;
        return k;
    }
}
