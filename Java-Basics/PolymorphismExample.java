class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}