public class ReplaceFirstWithLastNumber {
public static void main(String[] args){


int[] number= new int[10];
number[0] = 20;
number[1] = 30;
number[2] = 40;
number[3] = 50;
number[4] = 60;
number[5] = 70;
number[6] = 80;
number[7] = 90;
number[8] = 100;
number[9] = 110;

        
int temp = number[1];
number[0] = number[number.length - 1];
number[number.length - 1] = temp;

for (int index = 0; index < number.length; index++) {
System.out.print(number[index] + " ");
}


}
}