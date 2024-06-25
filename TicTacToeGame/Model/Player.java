package TicTacToeGame.Model;

public class Player {
    private String name;
    private PlayingPeice playingPeice;

    public Player(String name, PlayingPeice playingPeice){
        this.name = name;
        this.playingPeice = playingPeice;
    }

    public String getName() {
        return name;
    }

    public PlayingPeice getPlayingPeice() {
        return playingPeice;
    }
}
