public class Square implements Shape {
    private final double side;

    public Square(double a) throws IllegalArgumentException {
        if (a <= 0.0D) {
            throw new IllegalArgumentException("Side must be positive");
        } else {
            this.side = a;
        }
    }

    public double calcArea() {
        return Math.pow(this.side, 2.0D);
    }

    public double calcPerimeter() {
        return 4.0D * this.side;
    }

    public String name() {
        return "Квадрад";
    }
}
