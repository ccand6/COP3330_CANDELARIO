import java.lang.Math;

public class Circle extends Shape2D {
    double radius;
    double area;
    String Name;

    public Circle(double radius) {
        getName();
        getArea();
    }

    public String getName() {
        Name = "circle";
        return Name;
    }

    public double getArea() {
            area = Math.PI * Math.pow(radius, 2);
        return 0;
    }

}
