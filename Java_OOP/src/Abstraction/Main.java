package Abstraction;

public class Main {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        System.out.println(circle.area(5));

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
        System.out.println(rectangle.area(5));
    }
}

abstract class GraphicObject{
    int x, y;

    void moveTo(int newX, int newY){
        System.out.println("move to x: " + x);
        System.out.println("move to y: " + y);
    }

    abstract void draw();
    abstract void resize();
    abstract double area(double x);
}


class Circle extends GraphicObject{
    void draw(){
        System.out.println("Drawing circle");
    }
    void resize(){
        System.out.println("Resize circle");
    }
    double area(double r){ return 3.14*(r*r);}
}


class Rectangle extends GraphicObject{
    void draw(){
        System.out.println("Drawing rectangle");
    }
    void resize(){
        System.out.println("Resize rectangle");
    }
    double area(double a){ return a*a;}
}