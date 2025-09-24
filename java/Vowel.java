import java.util.Scanner;
public class Vowel{
public static void main(String []args){

Scanner input = new Scanner(System.in);
System.out.print("ENter a String: ");
String word = input.nextLine().toLowerCase().trim();

for(int counter = 0; counter < word.length(); counter++){
	char check = word.charAt(counter);
	
	if(check == 'a' || check == 'e' || check == 'o' 
		|| check == 'u' || check == 'i'){
		
		System.out.print(check + " ");
	}
}


}
}