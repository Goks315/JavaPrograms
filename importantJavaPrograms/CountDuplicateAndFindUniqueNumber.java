package importantJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicateAndFindUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 3,2,4 };
         // Print unique number from the list- Amazon 
		
		// Print the numbers
		List<Integer> ab = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				//System.out.println("Number "+a[i] );
				if(k>1) {
				System.out.println( a[i]+" Elemnent "+ k+" times occured");
				}
				if (k == 1)
					System.out.println(a[i] + " is unique number");

			}
		}

	}

}