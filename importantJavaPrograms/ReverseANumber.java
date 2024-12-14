package importantJavaPrograms;

import java.util.Scanner;

public class ReverseANumber {

	
	public void reverseNumber(){
		
		System.out.println("Enter Number");
		Scanner myObj = new Scanner(System.in);
		
		int number=myObj.nextInt();
		int reverse=0;
		
		System.out.println(" Given Number : "+ number);
		
		while(number!=0){
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}
		
		System.out.println(" Reversed Number : "+ reverse);
	}
	public static void main(String[] args) {

		ReverseANumber aNumber= new ReverseANumber();
		
		aNumber.reverseNumber();

	}

}
