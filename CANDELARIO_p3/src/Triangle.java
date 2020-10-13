public class Triangle extends Shape2D {
    double base;
    double height;
    double area;
    String Name;

    public Triangle(double base, double height) {
        area = base * height;
    }

    public String getName() {
        Name = "triangle";
        return Name;
    }

    public double getArea() {
        return area;
    }

}

