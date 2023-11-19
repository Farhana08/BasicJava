package basicjava;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
	 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.print("Enter your name : ");
		name = input.nextLine(); // For String to print use nextLine to print two words
		System.out.println("Welcome : " + name);
		

//		int number;
//		System.out.print("Enter any number : ");
//		number = input.nextInt();
//		System.out.println("Number = " +number );
//	
	}

}
