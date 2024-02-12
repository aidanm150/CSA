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

    public Complex add(double a, double b, double c, double d){
        return new Complex((a+c),(b+d));
    }

    public Complex multiply(Complex other){
        Complex p = new Complex((x*other.x)-((y*other.y)*1),(x*other.y)+(y*other.x));
        return p;
    }

    public Complex multiply(double a, double b, double c, double d){
        Complex p = new Complex((a*c)-((b*d)*1),(a*d)+(b*c));
        return p;

    }

    public static void main(String args[]){
        Complex a = new Complex(2.0,3.0);
        Complex b = new Complex(3.0,1.0);
        Complex c = new Complex(3.0,-2.0);
        Complex d = new Complex(-5.0,2.0);
        Complex e = new Complex(4.5);
        Complex f = new Complex(0,5);
        System.out.println(a.abs());
        System.out.println(b.abs());
        System.out.println(c.abs());
        System.out.println(d.abs());
        System.out.println(e.abs());
        System.out.println(f.abs());
        System.out.println(a.add(b));
        System.out.println(b.add(c));
        System.out.println(e.add(f));
        System.out.println(a.multiply(b));
        System.out.println(c.multiply(d));
        System.out.println(e.multiply(f));
    }
}   