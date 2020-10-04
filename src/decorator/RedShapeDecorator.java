package decorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw() {
        setRedBorder();
        super.draw();
    }
    public void setRedBorder(){
        System.out.println("Border color:red");
    }

}
