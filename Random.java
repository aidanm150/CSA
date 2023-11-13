
public class Random {
    public static void main(String[] args){
        double x = Math.random();
        System.out.println(x);
             
        x=Math.random()*20;
        System.out.println(x);
        int a = (int)(Math.random()*51)+50;
        System.out.println(a);

        int b = (int)(Math.random()*11);
        System.out.println(b);

        // a single 6 sided die
        int c = (int)(Math.random() * 6 + 1);
        System.out.println(c);

        // coin flig
        int d = (int)(Math.random()*2);
        System.out.println(d);

        // pair of 6 sided dice
        int e = (int)(Math.random()*6)+ (int)(Math.random()*6) + 2;
        System.out.println(e);

        // passing grade 65-100
        int f = (int)(Math.random()*36)+ 65;
        System.out.println(f);




       
    }
}