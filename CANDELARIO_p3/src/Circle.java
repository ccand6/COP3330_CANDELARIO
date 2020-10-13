import java.lang.Math;

public class Circle extends Shape2D {
    double radius;
    double area;
    String Name;

    public Circle(double radius) {
        area = Math.PI * Math.pow(radius, 2);
    }

    public String getName() {
        Name = "circle";
        return Name;
    }

    public double getArea() {
        return area;
    }

}
