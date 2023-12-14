public class ForLoops {
    public int addEvens(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public void printSquaresBack(int n){
        for(int i=1;i<=n;i++){
            double j = Math.pow(n,2);
            n-=i;
            System.out.print(j + " ");
        }
    }

    public static void main(String args[]){
        ForLoops ab = new ForLoops();
        System.out.println(ab.addEvens(2));
        System.out.println(ab.addEvens(7));
        System.out.println(ab.addEvens(5));
        ab.printSquaresBack(8);
    }
}
