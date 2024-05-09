public class TicTacToe {

	public static void displayBoard(char [][] board) {
		System.out.println();
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j ++) {
				if(j < 2) {
					System.out.printf(" %c |", board[i][j]);
				} else {
					System.out.printf(" %c ", board[i][j]);
				}
			}
			if(i < 2) {
				System.out.print("\n---|---|---\n");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		char[][] board = new char[3][3];
	
		// make all board symbols as spaces
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j ++) {
				board[i][j] = ' ';
			}
		}
		displayBoard(board);

		// lets insert some moves
		board[0][1] = 'X';
		board[0][2] = 'O';
		board[0][0] = 'X';
		
		displayBoard(board);
		
		//TODO: get next position from user (input)
		//TODO: validate the position; check if it is already filled
		//TODO: check the winning state
		//TODO: repeat
		//TODO: finally, draw the game if no winning even after all moves
	}
}

