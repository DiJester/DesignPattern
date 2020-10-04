package decorator;

class Circle extends Shape {
    public Circle(){
        name = "circle";
    }
    @Override
    public void draw() {
        System.out.println("Shape:"+ name);
    }

}
