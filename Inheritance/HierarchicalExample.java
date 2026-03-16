// Parent class
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

// Child class 1
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}

// Child class 2
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing Rectangle");
    }
}

// Main class
public class HierarchicalExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.drawCircle();

        r.display();
        r.drawRectangle();
    }
}
