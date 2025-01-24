
public class Pyramid extends Shape3D {
    public Pyramid(double depth, double height, double width) {
        super(depth, height, width);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * depth * height * width;
    }

    @Override
    public double getArea() {
        
        return depth * width + depth * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) +
                width * Math.sqrt(Math.pow(depth / 2, 2) + Math.pow(height, 2));
    }
}
