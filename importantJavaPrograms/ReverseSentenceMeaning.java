package importantJavaPrograms;

import java.util.Scanner;

public class ReverseSentenceMeaning {

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        
        //Breaking the sentence into words
        String s[] = str.split(" ");
        
        //Adding the words stored in the array to the last
        for(int i=0;i<s.length;i++){
            rev = s[i]+" "+rev;
            System.out.println(s[i]);
            System.out.println(rev);
        }
        
        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);
  } 
}