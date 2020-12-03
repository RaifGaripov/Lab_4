public class Rectangle implements Shape {
    private final double side1;
    private final double side2;

    public Rectangle(double a, double b) throws IllegalArgumentException {
        if (a > 0.0D && b > 0.0D) {
            this.side1 = a;
            this.side2 = b;
        } else {
            throw new IllegalArgumentException("Length and width must be positive");
        }
    }

    public double calcArea() {
        return this.side1 * this.side2;
    }

    public double calcPerimeter() {
        return (this.side1 + this.side2) * 2.0D;
    }

    public String name() {
        return "Прямоугольник";
    }
}
