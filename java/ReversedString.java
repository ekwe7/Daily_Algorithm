public class ReversedString{
public static void main(String[] args){
	String input = "complecated";
	System.out.print(reverse(input));

}

public static String reverse(String str){
String reversed = "";
for(int index = str.length()-1; index >= 0; index--){
	reversed += str.charAt(index);
	
	}
	return reversed;

}
}




