
public class TicTacToa{
public static void main(String...ekwe){

char[][] board = {{'X', 'O', 'X'},
			{'O', 'X', 'O'},
			{'X', 'O', 'X'}};
			
for (int index = 0; index < 3; index++){
	for(int count = 0; count < 3; count++){
	System.out.print(board[index][count]);
		if(count < 2){
		System.out.print(" | ");
		}
	}
System.out.println();
	if(index < 2){
	System.out.println("--------");
	}
}



}
}