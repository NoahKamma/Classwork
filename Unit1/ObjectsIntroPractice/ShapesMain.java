
public class ShapesMain 
{

	public static void main(String[] args)
		{
			//Calls circle objects with their own respective values: 6.7 and 4.1
			Circle myCirc1 = new Circle(6.8);
			Circle myCirc2 = new Circle(4.1);
		
			//First print out the reference code of myCirc1
			System.out.println(myCirc1);
		
			//Set myCirc3 value to myCirc1
			Circle myCirc3 = myCirc1;
		
		
			//Print out the radius of myCirc1
			System.out.println(myCirc1.getRadius());
		
		
			//Assign a new radius to myCirc1 through the "setRadius" method in "Circle" class
			myCirc1.setRadius(7.0);
		
			//Print out myCirc1 radius
			System.out.println(myCirc1.getRadius());
			
			//This prints the circumference of Circ1
			System.out.println(myCirc1.getCircumf());
			
			//This prints the area of Circ1
			System.out.println(myCirc1.getArea());
		
			//This prints the degrees of the circle object
			System.out.println(Circle.getDegrees());
			
			//This calls a method from "Circle" class to state the purpose of this class
			Circle.stateShape();
		}
	
}
