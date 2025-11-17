import java.util.Arrays;

public class AddMultipleElementsToArray{
public static void main(String oxy[]){

int[] arr = new int[20];

arr[0] = 2;
arr[1] = 3;
arr[2] = 4;
arr[3] = 5;
arr[4] = 6;

int usedELement = 5;

int[] newElement = {12, 9, 19, 80};

for(int index = usedELement; index > 0; index--){
	arr[index] = arr[index - 1];	
}

arr[0] = newElement;
usedElement++;

for(int i = 0; i < newElement.length; i++){
	if(usedELement < arr.length){
	arr[usedELement] = newElement[i];
	usedELement++;
	}
}

for(int index = 0; index < usedELement; index++){
	System.out.print(arr[index] + " ");
}

}

}