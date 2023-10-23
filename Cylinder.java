public class Cylinder {

    public Circle circle1;
    public double height;

    public Cylinder(double r , double h){
        this.circle1 = new Circle(r);
        h = height;
    }

    public double vol(){
        double v = Math.PI * Math.pow(2.0,circle1.getRadius());
        return v;
    }

    public double sa(){
        double a = 2 * Math.PI * circle1.getRadius() * height + 2 * Math.PI * Math.pow(2.0,circle1.getRadius());
        return a;
    }

}
