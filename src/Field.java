import java.io.*;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private static final char DEFAULT_DAGGER_VALUE = 'X';

    private static final char DEFAULT_ZERO_VALUE = '0';

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void eraseField() {
        for (int i=0; i < FIELD_SIZE; i++) {
            eraseLine(i);
        }
    }

    public void HumanMove() throws IOException {
        int x = -1, y = -1;
        System.out.println("Enter y (1..3):");
        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in));
        x = Integer.parseInt(br.readLine())-1;
        System.out.println("Enter x (1..3):");
        y = Integer.parseInt(br.readLine())-1;
        /*while (field[x][y] == '0' || field[x][y] == 'X' || x < 0 || x > 2
                || y < 0 || y > 2) {
            System.out.println("Enter y:");
            x = Integer.parseInt(br.readLine())-1;
            System.out.println("Enter x:");
            y = Integer.parseInt(br.readLine())-1;
        }
        field[x][y] = 'X';*/
    }

    public void showField() {
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++) {
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    public void setDagger( int columnNumber, int lineNumber ) {
        field[columnNumber][lineNumber] = DEFAULT_DAGGER_VALUE;
    }

    public void setZero( int columnNumber, int lineNumber ) {
        field[columnNumber][lineNumber] = DEFAULT_ZERO_VALUE;
    }

    private void eraseLine(int lineNumber) {
        for (int i=0; i <FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            showCell(i, lineNumber);
        }
    }

    private void showCell( int x, int y ) {
        System.out.print("{" + field[x][y] + "}");
    }
}

