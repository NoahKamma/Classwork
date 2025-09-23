

public class ShapesProjectMain 
{
	/*
	 * This instantciates the shapes, 
	 * each with three different objects
	 */
	public static void main(String[] args) 
		{
			
			Circle Circ1 = new Circle(6.9);
			Circle Circ2 = new Circle(4.1);
			Circle Circ3 = new Circle(6.7);

			Square Squa1 = new Square(4);
			Square Squa2 = new Square(6);
			Square Squa3 = new Square(9);
			
			Rectangle Rect1 = new Rectangle(8,4);
			Rectangle Rect2 = new Rectangle(4,9);
			Rectangle Rect3 = new Rectangle(3,4);
			
			Cube Cube1 = new Cube(4);
			Cube Cube2 = new Cube(19);
			Cube Cube3 = new Cube(41);
			
			Sphere Sphe1 = new Sphere(7.1);
			Sphere Sphe2 = new Sphere(6.7);
			Sphere Sphe3 = new Sphere(4.1);
			
			//This prints out some of the stats of the shapes
			System.out.println(Circ1.getArea());
			System.out.println(Squa2.getPerimeter());
			System.out.println(Rect3.getArea());
			System.out.println(Cube1.getSurfaceArea());
			System.out.println(Sphe2.getVolume());
			
		}
	
	
	
}
