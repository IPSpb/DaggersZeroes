import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Field field = new Field();
        field.eraseField();
        field.setDagger(1, 2);
        field.setZero(1, 1);
        field.HumanMove();

        /*field.showField();*/

    }
}
