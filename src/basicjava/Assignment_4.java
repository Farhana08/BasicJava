package basicjava;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int phonePrice = 1800;
		int numberOfInstallment, installmentPerMonth ;
		
		System.out.print("Number of installments : ");
		numberOfInstallment = input.nextInt();
		
		installmentPerMonth = phonePrice / numberOfInstallment;
	        
		System.out.print("Monthly Installment Amount: "+installmentPerMonth+" euros");
	    installmentPerMonth = input.nextInt();
		 
		
	}

}
