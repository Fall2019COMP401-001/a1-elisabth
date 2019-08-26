package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numCustomers = scan.nextInt();
		char firstName;
		String lastName;
		int itemsBought;
		double numPurchased;
		String nameOfItem;
		double priceOfItem;
		double itemTotalPrice;
		double totalCost = 0;
		String fullName;
		
		for(int i=0; i<numCustomers; i++) {
			firstName = scan.next().charAt(0);
			lastName = scan.next();
			fullName = firstName + ". " + lastName;
			itemsBought = scan.nextInt();
			for(int j=0; j<itemsBought; j++) {
				numPurchased = scan.nextDouble();
				nameOfItem = scan.next();
				priceOfItem = scan.nextDouble(); 
				itemTotalPrice = numPurchased * priceOfItem;
				totalCost = totalCost + itemTotalPrice;
			}
			
			System.out.println(fullName + ": " + String.format("%.2f", totalCost));
		}
		
	}
	
}

