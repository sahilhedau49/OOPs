// package OOPs_Lab_7_6;

// Write a program to create a graphic class hierarchy. Create an abstract class Figure with abstract 
// display() , abstract length(). Derive two classes open and close from it. Class close contain abstract
// method area(). Derive 2 more classes’ polygon and eclipse from close. Derive line from class open.
// Create class point with data members as x and y, a constructor and display(). Line uses the class
// point’s object to define the start and end point of  line. In all the classes include overridden
// method to display data members. Demonstrate dynamic method dispatch on display and length method.
// Include appropriate constructors in all classes.(Area of eclipse is A=πab where a is major radius
// and b is minor radius, area of polygon is (s2n)/2tan(180/n) where s length of one side and n number
// of sides.

public class main {
    public static void main(String[] args) {
        figure[] f1 = new figure[5];

        point ps = new point(2, 3);
        point pe = new point(5, 4);

        f1[0] = new line(ps,pe);
        f1[0].display();
        f1[0].length();
    }
}
