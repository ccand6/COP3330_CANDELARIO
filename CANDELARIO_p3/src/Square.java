public class Square extends Shape2D {
    double area;
    double side;
    String Name;

    public Square(double side) {
        area = side * side;
    }

    public String getName() {
        Name = "square";
        return Name;
    }

    public double getArea() {
        return area;
    }
}
