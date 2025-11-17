public class AddMultipleElementsToArrayFromBack{
public static void main(String oxy[]){

int[] arr = new int[20];

arr[0] = 2;
arr[1] = 3;
arr[2] = 4;
arr[3] = 5;
arr[4] = 6;

int usedElement = 5;

//int insertindex = 2;

int[] newElement = {12, 9, 19, 80};

/*
for(int index = usedElement; index > 0; index--){
	arr[index] = arr[index - 1];	
}
*/

for(int index = usedElement - 1; index >= 0; index--){
	arr[index + newElement.length] = arr[index];
}

for(int count = 0; count < newElement.length; count++){
	arr[count] = newElement[count];
}

usedElement += newElement.length;

for(int index = 0; index < usedElement; index++){
	System.out.print(arr[index] + " ");
}








}
}