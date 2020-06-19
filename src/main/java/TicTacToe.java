import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    char[][] gameboard;
    ArrayList<Player> players;
    /**
     * Builds gameboard and game instance
     */
    public TicTacToe(int numAi, ArrayList<Character> playerChars) {

        // TODO adjustible size of gameboard
        gameboard = new char[5][5];
        for (int i = 0; i < gameboard.length; i++) { Arrays.fill(gameboard[i], ' '); }

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[i].length; j++) {
                if (i % 2 == 1) {
                    Arrays.fill(gameboard[i], '-');
                } else {
                    if (j % 2 == 1) {
                        gameboard[i][j] = '|';
                    }
                }
            }
        }

        players = new ArrayList<>();

        for (int i = 0; i < playerChars.size(); i++) {
            players.add(new Player(playerChars.get(i)));
        }
        for (int i = 0; i < numAi; i++) {
            // TODO add ai
            // TODO randomize char(s) that Ai use(s)
            continue;
        }

    }

    @Override
    public String toString() {
        String out = "";
        for (char[] thisRow : this.gameboard) {
            for (char thisSpace : thisRow) {
                out += thisSpace;
            }
            out += "\n";
        }
        return out;
    }

//---------------------------------------------------static methods-----------------------------------------------------

    public static Player takeTurn(Player thisPlayer) {
        // TODO take action here
        return thisPlayer;
    }

    public static void main(String[] args) {
        int numPlayers;
        TicTacToe thisGame;
        boolean play;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Welcome to tic tac toe. Please enter the number of human players: ");
        numPlayers = kbd.nextInt();
        ArrayList<Character> playerChars = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Player " + (i + 1) + ", please enter your chosen character: ");
            playerChars.add(kbd.next().charAt(0));
        }

        thisGame = new TicTacToe(0, playerChars);
        play = true;

        while (play) {
            // TODO take turn
//            takeTurn(thisPlayer);
        }

        System.out.println("Gameboard: \n" + thisGame.toString());
    }
}
