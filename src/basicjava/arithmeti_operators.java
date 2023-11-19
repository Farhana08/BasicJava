package basicjava;

import java.util.Scanner;

public class arithmeti_operators {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
 int num1, num2, result;
 double result2;
 
System.out.print("Enter 1st num: ");
num1 = input.nextInt();

System.out.print("Enter 2nd num: ");
num2 = input.nextInt();

 result = num1+num2;
 System.out.println("Sum = " +result);
 
 result = num1-num2;
 System.out.println("Sub = " +result);
 
 result = num1*num2;
 System.out.println("Multiplication = " +result);
 
 result2 = (double)num1/num2;
 System.out.println("Div = " +result2);
 
 result = num1%num2;
 System.out.println("Remainder = " +result);
	}

}
