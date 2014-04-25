import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {

        Field field = new Field();
        field.eraseField();
        field.setDagger(1, 2);
        field.setZero(1, 1);
        System.out.println("Enter y (1..3):");
        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in));
        field.showField();

    }
}
