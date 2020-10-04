package decorator;

public abstract class ShapeDecorator extends Shape {
    Shape decoratedShape;
    public ShapeDecorator(Shape shape){
        this.decoratedShape=shape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
