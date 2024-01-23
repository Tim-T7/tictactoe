package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    public boolean isWinner() {
        // You will write this code!!
        int total; 
        for (int row=0; row<Constants.BOARD_SIZE; row++) {
            total = getBoardCell(row, 0) +
            getBoardCell (row, 1) +
            getBoardCell (row,2);
            if (total ==-3||total == 3) return true;
        }
        for (int col =0; col<Constants.BOARD_SIZE; col++) {
            total = getBoardCell (0,col) + 
            getBoardCell (1,col) +
            getBoardCell (2,col);
            if (total==-3||total ==3) return true;
        }
        total = getBoardCell (0,0) + getBoardCell (1,1) + getBoardCell(2,2);
        if (total == -3 || total ==3) return true;
        total = getBoardCell (2,0) + getBoardCell(1,1) + getBoardCell (0,2);
        if (total == -3 || total ==3) return true;
        return false;
    }

    public boolean isTie() {
        // You will write this code too!!
        
    }

    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }

}

