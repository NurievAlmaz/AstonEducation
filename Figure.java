public interface Figure {

    double getArea();
    double getPerimeter();
    String getBorderColor();
    String getFillColor();

    default void printFigureInfo() {
        System.out.println("Периметр фигуры — " + getPerimeter());
        System.out.println("Площадь фигуры — " + getArea());
        System.out.println("Фоновый цвет — " + getFillColor());
        System.out.println("Граничный цвет — " + getBorderColor());
    }
}
