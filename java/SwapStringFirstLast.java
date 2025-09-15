import java.util.Scanner;

public class SwapStringFirstLast{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

 System.out.print("Enter a string: ");
String str = scanner.nextLine();

 if(str.length() > 1){
  char firstChar = str.charAt(0);
  char lastChar = str.charAt(str.length() - 1);

   String swappedStr = lastChar + str.substring(1, str.length() - 1) + firstChar;
   System.out.println("Swapped string: " + swappedStr);
   
} else{
   System.out.println("idiot String should have at least 2 characters.");
        }


}
}
