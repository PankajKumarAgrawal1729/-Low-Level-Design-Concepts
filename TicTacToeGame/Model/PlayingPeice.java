package TicTacToeGame.Model;

public class PlayingPeice {
    private String peiceType;

    public PlayingPeice(PeiceType peiceType){
        this.peiceType = peiceType.getPeice();
    }

    public String getPeiceType() {
        return peiceType;
    }
    
}
