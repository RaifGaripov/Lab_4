public class Circle implements Shape {
    private final double radius;

    public Circle(double a) throws IllegalArgumentException {
        if (a <= 0.0D) {
            throw new IllegalArgumentException("Radius must be positive");
        } else {
            this.radius = a;
        }
    }

    public double calcArea() {
        return 3.141592653589793D * Math.pow(this.radius, 2.0D);
    }

    public double calcPerimeter() {
        return 6.283185307179586D * this.radius;
    }

    public String name() {
        return "Круг";
    }
}
