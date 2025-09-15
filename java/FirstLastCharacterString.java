//first and last character of a given string

import java.util.Scanner;

public class FirstLastCharacterString{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a word: ");
	String word = scanner.nextLine();
	
	if(word.length() > 0){
	
	char firstChar = word.charAt(0);
	char secondChar = word.charAt(word.length() -1);
	
	
	System.out.println("first char is " + firstChar);
	System.out.println("second char is " + secondChar);

	}else{
	System.out.println("Idiot enter a Statement!");
	}


}
}