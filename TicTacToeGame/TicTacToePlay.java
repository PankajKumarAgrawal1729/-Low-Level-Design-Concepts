package TicTacToeGame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import TicTacToeGame.Model.Board;
import TicTacToeGame.Model.Player;
import TicTacToeGame.Model.PlayingPeice;
import TicTacToeGame.Model.PlayingPeiceO;
import TicTacToeGame.Model.PlayingPeiceX;

public class TicTacToePlay {
    Deque<Player> players;
    Board gameBoard;
    boolean gameCompleted;

    public TicTacToePlay() {
        initialiseGame();
    }

    private void initialiseGame() {
        // Creating 2 palyers
        PlayingPeice crossPeice = new PlayingPeiceX();
        Player player1 = new Player("Player1", crossPeice);

        PlayingPeice noughtPeice = new PlayingPeiceO();
        Player player2 = new Player("Player2", noughtPeice);

        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
        this.gameCompleted = false;
    }

    public void startGame() {

        Scanner sc = new Scanner(System.in);

        while (!this.gameCompleted) {
            Player playerTurn = players.peek();

            System.out.println(playerTurn.getName() + " Enter Row and Column: ");
            int row = sc.nextInt();
            int column = sc.nextInt();
            Boolean isMovePlayed = gameBoard.addPeice(row, column, playerTurn.getPlayingPeice());
            if (isMovePlayed) {
                boolean isPlayerWins = gameBoard.isPlayerWins(row, column);
                boolean isGameTie = gameBoard.isGameTied();
                if (isPlayerWins) {
                    System.out.println(playerTurn.getName() + " Wins!!");
                    gameBoard.printBoard();
                    this.gameCompleted = true;
                } else if (isGameTie) {
                    System.out.println("Game Tie.");
                    gameBoard.printBoard();
                    this.gameCompleted = true;
                } else {
                    players.poll();
                    players.add(playerTurn);
                }
            } else {
                players.poll();
                players.addFirst(playerTurn);

            }
        }
        sc.close();
    }
}
