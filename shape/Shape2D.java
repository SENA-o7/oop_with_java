

public abstract class Shape2D {
    protected double height;
    protected double width;
    protected double radius;

    
    
    public Shape2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    
    
    public Shape2D(double radius) {
        this.radius = radius;
    }

    // Abstract method 
    
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape2D: Area = " + getArea();
    }
}
