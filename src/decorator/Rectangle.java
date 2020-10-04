package decorator;

class Rectangle extends Shape {
    public Rectangle(){
        name = "rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Shape:"+ name);
    }
}
