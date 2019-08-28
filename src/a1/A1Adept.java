package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		// Your code follows here.
		
		String nameOfItem;
		double itemPrice;
		String firstName;
		String lastName;
		String fullName;
		int numOfItems;
		int itemQuantity;
		String itemName;
		double itemTotalPrice = 0;
		double totalCost = 0;
		double biggestSpender = 0;
		double smallestSpender = 0;
		String biggestSpenderName = null;
		String smallestSpenderName = null;
		double individualTotalCost = 0;
		double maxValue = 0;
		double minValue = 10000;
		
		
		
		int numOfStoreItems = scan.nextInt();
		String[] storeItemsArray = new String[numOfStoreItems];
		double[] itemPriceArray = new double[numOfStoreItems];
		
		// Your code follows here.
		for(int i=0; i<numOfStoreItems; i++) {
			nameOfItem = scan.next();
			itemPrice = scan.nextDouble();
			storeItemsArray[i]= nameOfItem;
			itemPriceArray[i] = itemPrice;
		}
		
		int numOfCustomers = scan.nextInt();
		double[] customerTotalArray = new double[numOfCustomers];
		String[] customerFullNameArray = new String[numOfCustomers];
		
		for(int j=0;j<numOfCustomers; j++) {
			firstName = scan.next();
			lastName = scan.next();
			fullName = firstName + " " + lastName;
			customerFullNameArray[j] = fullName;
			numOfItems = scan.nextInt();
			individualTotalCost = 0;
			for(int k=0; k<numOfItems; k++) {
				itemQuantity = scan.nextInt();
				itemName = scan.next();
				for(int l=0; l<storeItemsArray.length; l++) {
					if(storeItemsArray[l].contentEquals(itemName)){
						itemTotalPrice = itemPriceArray[l] * itemQuantity;

					}
					
				}
				totalCost = totalCost + itemTotalPrice;
				individualTotalCost = individualTotalCost + itemTotalPrice;
			}	
			customerTotalArray[j] = individualTotalCost;
		}
		
		for(int i=0; i<customerTotalArray.length;i++) {
			if(customerTotalArray[i] > maxValue) {
				biggestSpender = customerTotalArray[i];
				biggestSpenderName = customerFullNameArray[i];
				maxValue = customerTotalArray[i];
			}

		}
		
		for(int i=0; i<customerTotalArray.length;i++) {
			if(customerTotalArray[i] < minValue) {
				smallestSpender = customerTotalArray[i];
				smallestSpenderName = customerFullNameArray[i];
				minValue = customerTotalArray[i];
			}
		}
		
		System.out.println("Biggest: " + biggestSpenderName + "(" + biggestSpender + ")");
		System.out.println("Smallest: " + smallestSpenderName + "(" + smallestSpender + ")");
		System.out.println("Average: " + String.format("%.2f", totalCost/numOfCustomers));

	}
		
}

