package inheritance;
import java.util.Scanner;

//Base class
class Shape {
 protected String name;

 public Shape(String name) {
     this.name = name;
 }

 public void display() {
     System.out.println("Shape: " + name);
 }

 public double area() {
     return 0.0;
 }
}

//Derived class 1: Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(String name, double length, double width) {
     super(name);
     this.length = length;
     this.width = width;
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Type: Rectangle");
     System.out.println("Length: " + length);
     System.out.println("Width: " + width);
     System.out.println("Area: " + area());
 }

 @Override
 public double area() {
     return length * width;
 }
}

//Derived class 2: Circle
class Circle extends Shape {
 private double radius;

 public Circle(String name, double radius) {
     super(name);
     this.radius = radius;
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Type: Circle");
     System.out.println("Radius: " + radius);
     System.out.println("Area: " + area());
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }



 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the length and width of the rectangle:");
     double length = scanner.nextDouble();
     double width = scanner.nextDouble();
     Rectangle rectangle = new Rectangle("Rectangle", length, width);

     System.out.println("Enter the radius of the circle:");
     double radius = scanner.nextDouble();
     Circle circle = new Circle("Circle", radius);

     System.out.println("Displaying Rectangle:");
     rectangle.display();

     System.out.println("\nDisplaying Circle:");
     circle.display();

     scanner.close();
 }
}

