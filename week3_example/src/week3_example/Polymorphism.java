package week3_example;
import java.util.ArrayList;

public class Polymorphism {
	public static void main(String [] args) {
		ArrayList<Object> shapes = new ArrayList<Object>();
		
		Object circle = new Circle("s", 6.0, 20.0, 5.0);
		Object rectangle = new Rectangle("a", 5.0, 12.0, 9.0);
		Object square = new Square("q", 2.0, 5.0, 3.0);
		shapes.add(circle);
		shapes.add(rectangle);
		shapes.add(square);
		
		printProperties(shapes);
	}
	
	 public static void printProperties(ArrayList<Object> shapes) {
		for(int i = 0; i<shapes.size(); i++) {
			Object o = shapes.get(i);
			
			if(o instanceof Circle) {
				System.out.print("circle ");
				System.out.print(((Circle) o).name+" ");
				System.out.println(((Circle) o).radius);
				
			} else if (o instanceof Rectangle) {
				System.out.print("rectangle ");
				System.out.println(((Rectangle) o).perimeter);
			}else if (o instanceof Square) {
				System.out.println("square");
			}
		}
	}
	
	
}

class Shape extends Object {
	String name;
	Double area;
	Double perimeter;
	
	public Shape(String name, Double area, Double perimeter) {
		this.name = name;
		this.area = area;
		this.perimeter = perimeter;
	}
}

class Circle extends Shape {
	
	Double radius;

	public Circle(String name, Double area, Double perimeter, Double radius) {
		super(name, area, perimeter);
		this.radius = radius;
	}
}

class Rectangle extends Shape {
	Double length;
	
	public Rectangle(String name, Double area, Double perimeter, Double length) {
		super(name, area, perimeter);
		this.length = length;
	}
}

class Square extends Shape {
	
	Double side;
	
	public Square(String name, Double area, Double perimeter, Double side) {
		super(name, area, perimeter);
		this.side = side;
	}
}

