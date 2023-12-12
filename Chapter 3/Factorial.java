public class Factorial{
    public long calcFactorial(int a){
        long b = 1;
        for(int i=1; i<=a; i++){
            b = b*i;
        }
        return b;
    }

    public void calcEx(){
        
    }

    public static void main(String args[]){
        Factorial ab = new Factorial();
        System.out.println(ab.calcFactorial(4));
        System.out.println(ab.calcFactorial(8));
        for(int i=1; i<=20; i++){
            System.out.println(ab.calcFactorial(i));
        }
    }
}