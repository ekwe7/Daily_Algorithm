import java.util.Arrays;

public class SortingTwoDArraysAndReturnAsArray{
public static int[] arrayFunctionSquare(int[][] array){

int[] flatArray = new int[array.length * array[0].length];
int index = 0;

for(int count = 0; count < array.length; count++){
for(int counter = 0; counter < array[count].length; counter++){
flatArray[index++] = array[count][counter] * array[count][counter];
}
}
Arrays.sort(flatArray);
return flatArray;
}


public static void main(String[] args){

int[][] array = {{1, 2, 3}, {4, 5, 6}};
int[] result = arrayFunctionSquare(array);

for(int counter = 0; counter < result.length; counter++){
System.out.print(result[counter] + " ");
}

}
}