import sun.java2d.pipe.SpanShapeRenderer;

public class Rectangle extends Shape{

    private int lenght;
    private int width;


    public Rectangle(String color, int lenght, int width) {
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double getArea() {
        return lenght * width;
    }

    void show () {
        System.out.println(this.getClass().getSimpleName() + " kolor: " + getColor() + " pole powierzchni: " + getArea());
    }
}
