package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println(String.format("%.1f", c.calcArea()));
		System.out.println(String.format("%.1f", t.calcArea()));
		System.out.println(String.format("%.1f",r.calcArea()));

		c.printCenter(); 
		t.printCenter();
		r.printCenter();
		 
		System.out.println("");
		System.out.println("--중심좌표 이동(x,y축 5씩)");
		System.out.println("");
		c.moveCenter(5, 5);
		t.moveCenter(5, 5);
		r.moveCenter(5, 5);
		 
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}

}
