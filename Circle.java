public class Circle {
    private double radius;
    
    public Circle(double radius){
        
    }

    public double area(){
        double area = Math.PI * Math.pow(radius,2.0);
        return area;
    }

    public double circumference(){
        double circumference = 2 * Math.PI * radius;
    }
}
