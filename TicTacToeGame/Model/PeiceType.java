package TicTacToeGame.Model;

public enum PeiceType {
    X("X"),
    O("O");
    private String peice;

    private PeiceType(String peice){
        this.peice = peice;
    }

    public String getPeice() {
        return peice;
    }

    public void setPeice(String peice) {
        this.peice = peice;
    }
}
