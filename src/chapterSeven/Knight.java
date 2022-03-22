package chapterSeven;

public class Knight {
    int[][] board = new int[8][8];
    int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    int currentRow = 3;
    int currentColum = 4;
    int count = 0;
    int newMoveColumn = currentColum + horizontal[7];
    int newMoveRow = currentColum + horizontal[3];

    public int[][] getBoard() {
        return board;
    }

    public void setMark(int moveNumber) {
        setCurrentRowAndSetCurrentColumn(moveNumber);
        count++;
        board[currentRow][currentColum] = count;
    }

    private void setCurrentRowAndSetCurrentColumn(int moveNumber) {
        newMoveColumn = currentColum + horizontal[moveNumber];
         newMoveRow = currentColum + horizontal[moveNumber];

        if (newMoveColumn > board.length || newMoveRow > board.length)
            throw new ArrayIndexOutOfBoundsException("data don fall");
            currentColum += horizontal[moveNumber];
             currentRow += vertical[moveNumber];
    }
}
