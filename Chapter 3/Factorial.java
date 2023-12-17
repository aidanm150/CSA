
public class Factorial{
    public long calcFactorial(int a){
        long b = 1;
        for(int i=1; i<=a; i++){
            b = b*i;
        }
        return b;
    }

    public double calcE(){
        double olde = 0;
        double e = 1.0;
        int i = 1;
        while(e-olde>0.001){
            olde = e; 
            e+=1.0/calcFactorial(i);
            i++;
        }
        return olde;
    }

    public double calcEx(int x){
        double olde = 0;
        double e = 1.0;
        int y = 1;
        while(e-olde>0.001){
            olde = e;
            e+=Math.pow(x, y)/calcFactorial(y);
            y++;
        }
        return olde;
    }

    public static void main(String args[]){
        Factorial ab = new Factorial();
        System.out.println(ab.calcFactorial(4));
        System.out.println(ab.calcFactorial(8));
        for(int i=1; i<=20; i++){
            System.out.println(ab.calcFactorial(i));
        }
        System.out.println(ab.calcE());
        for(int i=1; i<=5; i++){
            System.out.printf("e is %2.3f \n", ab.calcEx(i));
        }
    }
}