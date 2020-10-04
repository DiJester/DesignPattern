package decorator;

public class ShapeDecoratorTest {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
        ShapeDecorator red = new RedShapeDecorator(s);
        red.draw();
    }
}
