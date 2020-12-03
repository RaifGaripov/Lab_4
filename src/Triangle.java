public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double a, double b, double c) throws IllegalArgumentException {
        if (a < b + c && b < a + c && c < a + b && a > 0.0D && b > 0.0D && c > 0.0D) {
            this.side1 = a;
            this.side2 = b;
            this.side3 = c;
        } else {
            throw new IllegalArgumentException("Nonexistent triangle");
        }
    }

    public double calcArea() {
        double p = this.calcPerimeter() / 2.0D;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double calcPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String name() {
        return "Треугольник";
    }
}