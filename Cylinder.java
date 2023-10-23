public class Cylinder {

    public Circle circle1;
    public double height;
    private double h;

    public Cylinder(double r , double h){
        this.circle1 = new Circle(r);
        this.h = height;
    }

    public double vol(){
        double v = Math.PI * Math.pow(circle1.getRadius(),2.0);
        return v;
    }

    public double sa(){
        double a = 2 * Math.PI * circle1.getRadius() * height + 2 * Math.PI * Math.pow(circle1.getRadius(),2.0);
        return a;
    }

}
