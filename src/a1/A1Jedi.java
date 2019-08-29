package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numOfStoreItems = scan.nextInt();
		String[] storeItemsArray = new String[numOfStoreItems];
		int[] countCustomers = new int[numOfStoreItems];
		int[] countItems = new int[numOfStoreItems];
		boolean checkNoDoubles = false;
		int countDoubles = 0;
		int noDuplicateItems;
		
		for(int i=0; i<numOfStoreItems; i++) {
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			storeItemsArray[i] = itemName;
		}
		
		int numOfCustomers = scan.nextInt();
		int[] countNumCustomers = new int[numOfStoreItems];
		
		for(int i=0; i<numOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int cusNumOfItems = scan.nextInt();
			//int[] customerNumArray = new int[cusNumOfItems];
			//String[] repeatItems = new String[cusNumOfItems];
			boolean[] customerBoolArray = new boolean[numOfStoreItems];
			for(int j=0; j<cusNumOfItems; j++) {
				int itemQuantity = scan.nextInt();
				String itemBoughtName = scan.next();
				//System.out.println(repeatItems[j]);
				for(int k=0; k<storeItemsArray.length; k++) {
					if(storeItemsArray[k].contentEquals(itemBoughtName)) {
						countItems[k] = countItems[k] + itemQuantity;
						customerBoolArray[k]=true;

						///customerNumArray [j] = i;
						//repeatItems [j] = itemBoughtName;
						//System.out.println(customerNumArray[j]);
						//for(int l=0;l<cusNumOfItems; l++) {
						//	if(repeatItems[l] != null && repeatItems[l].contentEquals(itemBoughtName)) {
						//		countDoubles = countDoubles +1;
						//	} else if(repeatItems[l] == null) {
						//		repeatItems[l] = itemBoughtName;
						//		System.out.println(repeatItems[l]);
						//	}
						//	}
						
						//repeatItems[k] = itemBoughtName;
					} else {
						countCustomers[k] = countCustomers[k] + 0;
						countItems[k] = countItems[k] + 0;
					}
				}
				
				//for(int l=0; l<repeatItems.length; l++) {
				//	for(int m=l+1; m<repeatItems.length; m++) {
				//		if(repeatItems[l].equals(repeatItems[m])) {
				//			countDoubles = countDoubles + 1;
				//		} 
				//	}
				//}
			

			}
			//noDuplicateItems = cusNumOfItems - countDoubles;
			for(int n=0;n<customerBoolArray.length; n++) {
				if(customerBoolArray[n] == true) {
					countCustomers[n] ++;
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
		//for(int i=0; i<customerNumArray.length; i++) {
		//	System.out.print(customerNumArray[i]);
		//}
	}

}
