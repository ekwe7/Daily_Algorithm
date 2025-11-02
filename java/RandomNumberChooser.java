
import java.util.Random;

public class RandomNumberChooser{

public static int getRandom(int[] numbers){
 
 Random input = new Random();
 
 int randomNumber;
 
 while(true){
 
 randomNumber = input.nextInt(54)+ 1;
 boolean validNumber = true;
 
 for(int index = 0; index < numbers.length; index++){
 if(randomNumber == numbers[index]){
 validNumber = false;
 }
 
 }
 if(validNumber){
 return randomNumber;
 }
 
 }
 }
public static void main(String[] args){

int[] numbers = {2, 5, 8 , 4, 45};

int result = getRandom(numbers);

System.out.print(result);
 
 
 }



}




