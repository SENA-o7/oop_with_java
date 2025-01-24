public class Sphere extends Shape3D {
    private static final double PI = Math.PI;

    public Sphere(double radius) {
        super(0, radius); // Depth is irrelevant for a sphere
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    @Override
    public double getArea() {
        return 4 * PI * radius * radius;
    }
}
