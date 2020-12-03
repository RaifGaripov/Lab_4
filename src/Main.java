import java.util.*;
public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IllegalArgumentException {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(3, 3, 3));
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(1, 2));

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(1 ,1, 1));
        triangles.add(new Triangle(5, 5, 5));
        triangles.add(new Triangle(9, 9, 9));

        ShapeAccumulator figures = new ShapeAccumulator();

        figures.addAll(shapes);
        figures.addAll(triangles);


        System.out.println("Фигура с максимальной площадью:\n" + figures.getMaxAreaShape());
        System.out.println("Фигура с минимальной площадью:\n" + figures.getMinAreaShape());
        System.out.println("Фигура с максимальным периметром:\n" + figures.getMaxPerimeterShape());
        System.out.println("Фигура с минимальным периметром:\n" + figures.getMinPerimeterShape());

        System.out.println("Суммарная площадь фигур: " + figures.getTotalArea());
        System.out.println("Суммарный периметр фигур: " + figures.getTotalPerimeter());


    }
}