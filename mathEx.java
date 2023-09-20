public class mathEx {
    public static void main(String [] args){
        int swapped1 = swap(21);
        System.out.println(swapped1);
        
    }

    public static int swap(int x){
        int y = (x%10)*10;
        int m = (x/10);
        int k = y + m;
        return k;
    }
}
