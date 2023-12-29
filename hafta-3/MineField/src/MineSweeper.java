import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mine;
    int closestMines;
    int emptyFields;
    String[][] mineField;
    String[][] emptyField;


    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineField = new String[row][col];
        this.emptyField = new String[row][col];
        this.mine = (row * col) / 4;
        this.emptyFields = (row * col) - mine;
    }

    public String[][] initField() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.mineField[i][j] = "-";
            }
        }
        return mineField;
    }

    public void replaceWithMine() {
        int mineCount = 0;
        Random random = new Random();

        String[][] tempArea = initField();

        while (mineCount < mine) {
            int randomRow = random.nextInt(row);
            int randomCol = random.nextInt(col);

            if (tempArea[randomRow][randomCol].equals("-")) {
                tempArea[randomRow][randomCol] = "*";
                mineCount++;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(tempArea[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String selectPoint(int row, int col) {
        return (mineField[row][col].equals("*")) ? "*" : "-";
    }

    public boolean isPointAlreadySelected(int row, int col) {
        return emptyField[row][col].equals("-");
    }

    public boolean isValidPoint(int row, int col) {
        return row < 0 || row >= mineField.length || col < 0 || col >= mineField[0].length;
    }

    public void checkPoint() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select row: ");
            int selectedRow = scanner.nextInt();
            System.out.println("Select col: ");
            int selectedCol = scanner.nextInt();

            if (isValidPoint(selectedRow, selectedCol)) {
                System.out.println("Invalid point. Please choose a point within the valid range.");
                continue;
            }

            if (!isPointAlreadySelected(selectedRow, selectedCol)) {
                System.out.println("This point has already been selected. Please choose another point.");
            } else {
                selectPoint(selectedRow, selectedCol);
                String pointPattern = mineField[selectedRow][selectedCol];

                if (isGameOver(pointPattern)) {
                    emptyFields = -1;
                    System.out.println("💥");
                } else {
                    isGameOver("-");
                    emptyFields--;
                    System.out.println();
                    System.out.println("👍");
                    System.out.println();
                    checkClosestMines(selectedRow, selectedCol);
                    System.out.println(" !!!! Closest Mines  : " + closestMines + " 🥶");
                    System.out.println("Remain empty fields : " + emptyFields);
                    System.out.println();
                }
                break;
            }
        }
    }

    public void checkClosestMines(int row, int col) {
        String selectedPoint = selectPoint(row, col);
        closestMines = 0;
        if (selectedPoint.equals("*")) {
            isGameOver(selectedPoint);
        } else {
            closestMines += isMine(row, col + 1) ? 1 : 0;

            closestMines += isMine(row, col - 1) ? 1 : 0;

            closestMines += isMine(row - 1, col) ? 1 : 0;

            closestMines += isMine(row + 1, col) ? 1 : 0;

            closestMines += isMine(row - 1, col - 1) ? 1 : 0;

            closestMines += isMine(row - 1, col + 1) ? 1 : 0;

            closestMines += isMine(row + 1, col + 1) ? 1 : 0;

            closestMines += isMine(row + 1, col - 1) ? 1 : 0;

            emptyField[row][col] = String.valueOf(closestMines);
        }
    }

    public boolean isMine(int row, int col) {
        return row >= 0 && row < this.row && col >= 0 && col < this.col && mineField[row][col].equals("*");
    }

    public boolean isGameOver(String pointPattern) {
        return pointPattern.equals("*");
    }

    public boolean isWin() {
        return emptyFields == 0;

    }

    public void gameField() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                emptyField[i][j] = "-";
                System.out.print(emptyField[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void replacedGameField() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(emptyField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void runGame() {
        System.out.println("-----Mine Fields-----");
        replaceWithMine();
        System.out.println();

        System.out.println("Game Starting !!!");
        System.out.println();
        gameField();
        System.out.println();
        while (emptyFields > 0) {
            checkPoint();
            if (emptyFields > 0) {
                replacedGameField();
            }
            if (isWin()) {
                break;
            }
        }

        if (isWin()) {
            System.out.println("Win the Game !!! 🥳🥳🥳🥳");
        } else
            System.out.println("Game Over !!! 🫡🫡🫡🫡");

    }


}
