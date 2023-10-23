public class Circle {
    private double radius;
    private double x;
    
    public Circle(double x){
        this.x = radius;
    }

    public double area(){
        double area = Math.PI * Math.pow(radius,2.0);
        return area;
    }

    public double circumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double getRadius(){
        return x;
    }
}