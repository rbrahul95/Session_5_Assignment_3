/*
Calculate the area of square and rectangles using
constructor overloading.
 */
package acadglid;

//Problem 3

class OverloadDemo
{       
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
   
}
public class Session_5_Assignment_3 {
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   ob.area(5);
	   ob.area(11,12);
	   //ob.area(2.5);
        }
}
