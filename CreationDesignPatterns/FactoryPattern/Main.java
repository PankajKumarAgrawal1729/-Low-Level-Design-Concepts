package CreationDesignPatterns.FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(input);
        shape.draw();
        sc.close();
    }
}
