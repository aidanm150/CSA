public class testPrac {
    public static void main(String args[]){
        int first = tocalcBinary(15);
        System.out.println(first);


    }

    public static int tocalcBinary(int x){
        int a = x / 8;
        int ab = x % 8;
        int b = ab / 4;
        int bb = ab % 4;
        int c =  bb / 2;
        int cb = bb % 2;
        int answer =  a*1000 + b*100 + c*10 + cb;
        return answer;
    }
}
