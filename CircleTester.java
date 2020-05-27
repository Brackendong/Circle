/*
* CircleTester.java
* Author: JiaoAng Dong
* Submission Date: 10/17/2019
*
* Purpose: This class used the methods from circle.java
* to compute test cases and print out whether the test is 
* correct or not.
 *
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 

		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);


		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?

		System.out.println("circle1=\n" + circle1);

		// set the circle2 radius to 5.3

		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements

		System.out.println("circle2=\n"+ circle2);


		// print circle1 diameter, area and perimeter

		System.out.println("circle1 diameter=\n"+ circle1.diameter());
		System.out.println("circle1 area=\n"+ circle1.area());
		System.out.println("circle1 perimeter=\n"+ circle1.perimeter());


		// print circle2 diameter, area and perimeter

		System.out.println("circle2 diameter=\n"+ circle2.diameter());
		System.out.println("circle2 area=\n"+ circle2.area());
		System.out.println("circle2 perimeter=\n"+ circle2.perimeter());

		// display whether circle1 is a unit circle
        
        
		if (circle1.isUnitCircle() == true) {
			System.out.println("The circle is a unit circle");
		}
		else 
			System.out.println("The circle is not a unit circle");

		// display whether circle2 is a unit circle

		System.out.println();

		if (circle2.isUnitCircle() == true) {
			System.out.println("The circle is a unit circle");
		}
		else  
			System.out.println("The circle is not a unit circle");
		

		// your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

        // 1st test case for method equals
		System.out.println();

		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.equals(circle2) == true) {
			System.out.println("Failed: equals");
		}
		else if (circle1.equals(circle2) == false) {
			System.out.println("Passed: equals");
		}

        // 2nd test case for method equals
		System.out.println();

		circle1.setX(2.0);
		circle1.setY(1.0);
		circle1.setRadius(2);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(2);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.equals(circle2) == false) {
			System.out.println("Failed: equals");
		}
		else if (circle1.equals(circle2) == true) {
			System.out.println("Passed: equals");
		}

		// 1st test case for method distance
		System.out.println();

		circle1.setX(1.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( (circle1.distance(circle2) - 1.414213562) < THRESHOLD ) {
			System.out.println("Passed: distance");
		}
		else {
			System.out.println("Failed: distance");
		}
		
		// 2nd test case for method distance
		System.out.println();

		circle1.setX(2.0);
		circle1.setY(1.0);
		circle1.setRadius(2);
		circle2.setX(1.0);
		circle2.setY(5.0);
		circle2.setRadius(4);

		System.out.println(circle1);
		System.out.println(circle2);
	
		if ( (circle1.distance(circle2) - 4.123105626) < THRESHOLD ) {
		System.out.println("Passed: distance");
	}
		else {
		System.out.println("Failed: distance");
	}
		
		//1st test case for isSmaller
		System.out.println();

		
		circle1.setX(2.0);
		circle1.setY(1.0);
		circle1.setRadius(3);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(3);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.isSmaller(circle2) == true) {
			System.out.println("Failed: isSmaller");
		}
		else if (circle1.isSmaller(circle2) == false) {
			System.out.println("Passed: isSmaller");
		}
		
		//2nd test case for isSmaller
		System.out.println();

		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(5);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.isSmaller(circle2) == true) {
			System.out.println("Passed: isSmaller");
		}
		else if (circle1.isSmaller(circle2) == false) {
			System.out.println("Failed: isSmaller");
		}
		
		//1st case for compareTo
		System.out.println();

		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(3);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.compareTo(circle2) == -1) {
			System.out.println("Passed: compareTo");
		}
		else if (circle1.compareTo(circle2) == 1) {
			System.out.println("Failed: compareTo");
		}
		else if (circle1.compareTo(circle2) == 0) {
			System.out.println("Failed: compareTo");
		}
		
		//2nd case for compareTo
		System.out.println();

		circle1.setX(1.0);
		circle1.setY(0.0);
		circle1.setRadius(8);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(3);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.compareTo(circle2) == -1) {
			System.out.println("Failed: compareTo");
		}
		else if (circle1.compareTo(circle2) == 1) {
			System.out.println("Passed: compareTo");
		}
		else if (circle1.compareTo(circle2) == 0) {
			System.out.println("Failed: compareTo");
		}
		
		// 1st case for intersects 
		System.out.println();

		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(3);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.intersects(circle2) == true) {
			System.out.println("Passed: intersects");
		}
		else if (circle1.intersects(circle2) == false) {
			System.out.println("Failed: intersects");
		}
		
		// 2nd case for intersects 
		System.out.println();

		circle1.setX(12.0);
		circle1.setY(10.0);
		circle1.setRadius(1);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(2);

		System.out.println(circle1);
		System.out.println(circle2);
		
		if ( circle1.intersects(circle2) == true) {
			System.out.println("Falsed: intersects");
		}
		else if (circle1.intersects(circle2) == false) {
			System.out.println("Passed: intersects");
		}
		
		
	}
}

