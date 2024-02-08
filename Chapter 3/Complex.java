public class Complex{
    private double x;
    private double y;
    private double k = 0.0;

    public Complex(double a, double b){
        x = a;
        y = b;
    }

    public Complex(double a){
        this(a,0.0);
    }

    public String toString(){
        return x + "+" + y + "*i";
    }

    public double abs(){
        if(y!=0.0){
            k = Math.sqrt(x*x+y*y);
        }
        return k;
    }

    public Complex add(Complex other){
        return new Complex((x+other.x),(y+other.y));
    }

    public Complex multiply(Complex other){
        Complex p = new Complex((x*other.x)-((y*other.y)*1),(x*other.y)+(y*other.x));
        return p;
    }

    public static void main(String args[]){
        Complex a = new Complex(2.0,3.0);
        Complex b = new Complex(3.0,1.0);
        System.out.println(a.abs());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}   