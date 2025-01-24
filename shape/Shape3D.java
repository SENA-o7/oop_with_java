// Abstract Shape3D Class
public abstract class Shape3D {
    protected double depth;
    protected double height;
    protected double width;
    protected double radius;

   
    public Shape3D(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }


    public Shape3D(double depth, double radius) {
        this.depth = depth;
        this.radius = radius;
    }

    // Abstract methods 
    public abstract double getVolume();

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape3D: Volume = " + getVolume() + ", Area = " + getArea();
    }
}
