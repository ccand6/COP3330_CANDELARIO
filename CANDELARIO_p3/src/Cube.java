public class Cube extends Shape3D {
    double area;
    double side;
    double volume;
    String Name;

    public Cube() {
        area = 6 * (side * side);
        volume = side * side * side;
    }

    public String getName() {
        Name = "cube";
        return Name;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}
