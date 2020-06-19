public class Player { // ai player will extend player

    private char playerChar;
    private int wins = 0;

    public Player(char playerChar) {
        this.playerChar = playerChar;
    }

    public void incWins() {
        wins++;
    }

    public int getWins() {
        return wins;
    }
}
