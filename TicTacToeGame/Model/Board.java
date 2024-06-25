package TicTacToeGame.Model;

public class Board {
    public int size;
    public PlayingPeice[][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPeice[size][size];
    }

    public boolean addPeice(int row, int column, PlayingPeice peice){
        if(row < 0 || row >= size || column < 0 || column >= size || board[row][column] != null){
            System.out.println("Invalid Position. Please Try Again!!");
            return false;
        }
        board[row][column] = peice;
        return true;
    }

    public boolean isPlayerWins(int row, int column){
        String currentPeiceType = board[row][column].getPeiceType();
        boolean rowWin = true;
        boolean colWin = true;
        boolean diagWin = true;
        boolean reverseDiagonal = true;
        for(int i = 0; i < size; i++){
            // check row
            if(board[row][i] == null || !board[row][i].getPeiceType().equals(currentPeiceType)){
                rowWin = false;
            }
            // check column
            if(board[i][column] == null || !board[i][column].getPeiceType().equals(currentPeiceType)){
                colWin = false;
            }

            // check diagonals
            if(board[i][i] == null || !board[i][i].getPeiceType().equals(currentPeiceType)){
                diagWin = false;
            }
            // check reverse Diagonal
            if(board[i][size - i - 1] == null || !board[i][size - i - 1].getPeiceType().equals(currentPeiceType)){
                reverseDiagonal = false;
            }
        }
        return rowWin || colWin || diagWin || reverseDiagonal;
    }

    public boolean isGameTied(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    System.out.print("- ");
                }else{
                    System.out.print(board[i][j].getPeiceType() + " ");
                }
            }
            System.out.println();
        }
    }
}
