//PART ONE: MODULUS
//What would each of the following 1-6 lines including the modulo operator cause to be printed?
     System.out.println(14 % 13); //1
     System.out.println(8 % 11); //8
     System.out.println(6 % 2); //0
     System.out.println(7 % 2); //1
     System.out.println(274 % 10); //4
     System.out.println(881 % 2); //1

//PART TWO: COMPOUND OPERATORS AND SHORTCUTS (credits to runestone.academy)

    int x = 0;
    int y = 1;
    int z = 2;
    x--; // x followed by the double minus sign
    y++;
    z+=y;


//After the above code runs, what are x, y, and z equal to?

/*
X= -1
Y= 2
Z= 4

*/
    int a = 3;
    int b = 5;
    int c = 2;
    a = c * 2;
    b = b / 2;
    c++;

//After the above code runs, what are a, b, and c equal to?
/*
a= 4
b= 2
c= 3
*/

//PART THREE: CASTING

    int total = 5 + 7 + 2;
    (double) (total / 3); //Option A
    total / 3; //Option B
    (double) total / 3; //Option C

/* 
Option C is correct.

Option A and B calculates "4,"or "4.0" because the sum of all numbers are converted to doubles too late or not at all.

*/

//Which of the above options correctly computes the average of total? Why do the other options not work?
