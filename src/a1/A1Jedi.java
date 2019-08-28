package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numOfStoreItems = scan.nextInt();
		String[] storeItemsArray = new String[numOfStoreItems];
		int[] countCustomers = new int[numOfStoreItems];
		int[] countItems = new int[numOfStoreItems];
		
		for(int i=0; i<numOfStoreItems; i++) {
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			storeItemsArray[i] = itemName;
		}
		
		int numOfCustomers = scan.nextInt();
		
		for(int i=0; i<numOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int cusNumOfItems = scan.nextInt();
			for(int j=0; j<cusNumOfItems; j++) {
				int itemQuantity = scan.nextInt();
				String itemBoughtName = scan.next();
				for(int k=0; k<storeItemsArray.length; k++) {
					if(storeItemsArray[k].contentEquals(itemBoughtName)) {
						countCustomers[k] = countCustomers[k] + 1;
						countItems[k] = countItems[k] + itemQuantity;
					} else {
						countCustomers[k] = countCustomers[k] + 0;
						countItems[k] = countItems[k] + 0;
					}
				}

			}
		}
		for(int i=0; i<numOfStoreItems; i++) {
			if(countCustomers[i] != 0 && countItems[i] != 0) {
				System.out.println(countCustomers[i] + " customers bought " + countItems[i] + " " + storeItemsArray[i]);
			} else {
				System.out.println("No customers bought " + storeItemsArray[i]);
			}
		}

	}
	
	//public static int countItemsBought(String name) {
		//return int;
	//}
}
