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
        int q=n;
        for(int i=1;i<=n;i++){
            int j = (int)Math.pow(q,2);
            q=q-1;
            System.out.print(j + " ");
        }
    }

    public void sillyNumbers(){
        for(int i=0;i<=9;i++){
            for(int q=1;q<=3;q++){
                System.out.print(i);
            }
        }
    }

    public void sillyNumbers2(){
        for(int i=9;i>=0;i--){
            for(int q=1;q<=3;q++){
                System.out.print(i);
            }
        }

    }

    public void dollarsAndStars(){
        for(int i=0;i<=5;i++){
            for(int k=0;k<i;k++){
                System.out.print("**");
            }
            for(int q=6;q>=i;q--){
                System.out.print("$");
            }
            for(int p=6;p>=i;p--){
                System.out.print("**");
            }
            for(int q=6;q>=i;q--){
                System.out.print("$");
            }
            for(int k=0;k<i;k++){
                System.out.print("**");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        ForLoops ab = new ForLoops();
        System.out.println(ab.addEvens(2));
        System.out.println(ab.addEvens(7));
        System.out.println(ab.addEvens(5));
        ab.printSquaresBack(8);
        System.out.println(" ");
        ab.sillyNumbers();
        System.out.println(" ");
        ab.sillyNumbers2();
        System.out.println(" ");
        ab.dollarsAndStars();
    }
}
