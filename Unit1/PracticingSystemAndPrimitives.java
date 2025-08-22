//Unfinished

Complete each of the following problems without any online aid.


Task 1: Print out your name using the letter "O" in ASCII art.

Example output:

public class Main {
    
//This prints Noah in ASCII Art
    public static void main(String[] args)
    {
        System.out.println("O    O   OO    OO   O  O");
        System.out.println("O O  O  O  O  O  O  O  O");
        System.out.println("O  O O  O  O  OOOO  OOOO");
        System.out.println("O   OO  O  O  O  O  O  O");
        System.out.println("O    O   OO   O  O  O  O");
    }
}

Task 2: Write code to compute the following math problem:



public class Main {
    

    public static void main(String[] args)
    {
      /* 
The following code solves this math problem

6.0 x (3.5 - 1.5 x 5)
 -------------------
     55.6 - 30.2 
   
     */
      
        System.out.println((6.0*(3.5-1.5*5.0))/(55.6-30.2));

    }
}
  
Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.14 and it never changes)

    //Radius variable for the user to input
double Radius = (4.0);

//Print the circumfence and area of the circle here
    System.out.print("The circumference of the circle is " + (2.0*3.14*Radius) + " and the area of the circle is "+ (3.14*Radius*Radius) + ".");

