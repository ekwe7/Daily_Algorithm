public class ReplaceCharAtIndex{
public static String replaceWith(String input, char target, char replace){

String result = "";

	for(int index = 0; index < input.length(); index ++){
		if(input.charAt(index) == target){
			result = result + replace;
		}else{
			result = result + input.charAt(index);
		}
	
	}
	return result;
}

public static void main(String[] args){

	String word = "Hello world";
	char target = 'o';
	char replace = 'a';
	
	String output =replaceWith(word, target, replace);
	System.out.println(output);
}
}