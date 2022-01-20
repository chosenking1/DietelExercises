package javaChapter2.Examples;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] ticTac = {{'X', 'O', 'O'},{'X','X','X'},{'O','X','O'}};

        System.out.println(ticTac[0][0] + " " + ticTac[0][1] + " " + ticTac[0][2] + " " + " "
                + ticTac[1][0] + " "+ " "
                + ticTac[1][1] + " "+ " " + ticTac[1][2] + " " + " " + ticTac[2][0] + " "+ " "
                + ticTac[2][1] + " "+ " " + ticTac[2][2] + " " );

        for (int firstLoop = 0; firstLoop < ticTac.length; firstLoop++){
            System.out.println();
            for(int secondLoop = 0; secondLoop < ticTac[firstLoop].length; secondLoop++){
                System.out.print(" " + ticTac[firstLoop][secondLoop]);

            }
        }
    }
}
