Complete each of the following problems without any online aid.


Task 1: Print out your name using the letter "O" in ASCII art.

Example output:

//This prints Noah in ASCII Art using a series of println code organized accordingly
public class Main {
    

    public static void main(String[] args)
    {
        //Prints Noah in ASCI Art
        System.out.println("O    O   OO    OO   O  O");
        System.out.println("O O  O  O  O  O  O  O  O");
        System.out.println("O  O O  O  O  OOOO  OOOO");
        System.out.println("O   OO  O  O  O  O  O  O");
        System.out.println("O    O   OO   O  O  O  O");
    }
}

Task 2: Write code to compute the following math problem:


 {
      /* 
The following code solves and prints the answer to this math problem

6.0 x (3.5 - 1.5 x 5)
 -------------------
     55.6 - 30.2 
   
     */
public class Main {
    

    public static void main(String[] args)
   
      //The equation is used to solve the math problem
        System.out.println((6.0*(3.5-1.5*5.0))/(55.6-30.2));

    }
}
  
Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.14 and it never changes)

//This code completes the task by using the formula for the circumference and area using the assigned radius, before printing them out in a full sentence
public class Main {
    

    public static void main(String[] args)
   
    //Radius variable for the user to input to calculate the area and circumference
double Radius = (4.0);

//Print the circumfence and area of the circle here
    System.out.print("The circumference of the circle is " + (2.0*3.14*Radius) + " and the area of the circle is "+ (3.14*Radius*Radius) + ".");
    }
}
