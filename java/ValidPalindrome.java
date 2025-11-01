public class ValidPalindrome{

public static boolean isPalindrome(String word){

int a_pointer = 0;
int b_pointer = word.length()-1;

while(a_pointer <= b_pointer){
if(word.charAt(a_pointer) != word.charAt(b_pointer)){
	return helperMethod(word, a_pointer++, b_pointer) || 
	helperMethod(word, a_pointer, b_pointer--);

	}
a_pointer++;
b_pointer--;
}

return true;
}

private static boolean helperMethod(String word, int fist, int last){

int a_pointer = 0;
int b_pointer = word.length()-1;

while(a_pointer <= b_pointer){
if(word.charAt(a_pointer) != word.charAt(b_pointer)){
	//call helper method on two different String

	}
a_pointer++;
b_pointer--;
}

return true;




}



public static void main(String...ekwe){

String word = "aaabaaacaaaa";

boolean result = isPalindrome(word);

System.out.print(result);

}


}