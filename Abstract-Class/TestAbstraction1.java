abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){System.out.println("Drawing rectangle!");}
}

class Circle1 extends Shape {
    void draw(){System.out.println("Drawing circle!");}
}

class TestAbstraction1 {
    public static void main(String args[]){
        Shape obj = new Rectangle();
        obj.draw();

        Shape obj1 = new Circle1();
        obj1.draw();
    }
}
