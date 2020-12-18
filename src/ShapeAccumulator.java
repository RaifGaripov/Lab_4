import java.util.*;

public class ShapeAccumulator {
    private List<Shape> shapes;

    public ShapeAccumulator(){
        shapes = new ArrayList<>();
    }

    public <T extends Shape> void add(Shape shape){
        shapes.add(shape);
    }

    public void addAll(Collection<? extends Shape> collection){
        shapes.addAll(collection);
    }

    public Shape getMaxAreaShape(){
        Shape maxAreaShape = null;
        double minShape = Double.MIN_VALUE;
        for (Shape shape: shapes){
            if(shape.calcArea() > minShape){
                minShape = shape.calcArea();
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;
    }

    public Shape getMinAreaShape(){
        Shape minAreaShape = null;
        double maxShape = Double.MAX_VALUE;
        for (Shape shape: shapes){
            if(shape.calcArea() < maxShape){
                maxShape = shape.calcArea();
                minAreaShape = shape;
            }
        }
        return minAreaShape;
    }

    public Shape getMaxPerimeterShape(){
        Shape maxPerimeterShape = null;
        double min = Double.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.calcPerimeter() > min) {
                min = shape.calcPerimeter();
                maxPerimeterShape = shape;
            }
        }
        return maxPerimeterShape;
    }

    public Shape getMinPerimeterShape(){
        Shape minPerimeterShape = null;
        double max = Double.MAX_VALUE;
        for (Shape shape : shapes) {
            if (shape.calcPerimeter() < max) {
                max = shape.calcPerimeter();
                minPerimeterShape = shape;
            }
        }
        return minPerimeterShape;
    }

    public double getTotalArea(){
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calcArea();
        }
        return result;
    }

    public double getTotalPerimeter(){
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calcPerimeter();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(" ");
        for (Shape shape : shapes) {
            result.append(shape.toString());
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

}
