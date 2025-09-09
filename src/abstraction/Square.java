package abstraction;

public class Square extends Shape {

    private final int base;
    private final int height;

    public Square(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base*height;
    }
}
