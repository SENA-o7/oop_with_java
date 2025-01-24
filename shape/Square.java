public class Square extends Shape2D {
    public Square(double side) {
        super(side, side); // Square has equal height and width
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
