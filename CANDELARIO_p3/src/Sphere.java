public class Sphere extends Shape3D {
    double area;
    double radius;
    double volume;
    String Name;

    public Sphere(double radius) {
        area = 4 * Math.PI * Math.pow(radius, 2);
        volume = (4 / 3) * Math.PI * Math.pow((2 * radius / 2), 3);
    }

    public String getName() {
        Name = "sphere";
        return Name;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}
