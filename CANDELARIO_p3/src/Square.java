public class Square extends Shape2D {
    double area = 0;
    double side = 10;
    String Name;

    public Square(double side) {
        getName();
        getArea();
    }

    public String getName() {
        Name = "square";
        return Name;
    }

    public double getArea() {
        area = 2 * side;
        return 0;
    }
}
