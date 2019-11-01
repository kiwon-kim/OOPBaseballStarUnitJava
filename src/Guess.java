import java.util.ArrayList;
import java.util.Scanner;

class Guess extends NumberContainer {
    void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Constant.DIGIT; i++)
            numbers.add(scanner.nextInt()); // parsing
    }

    @Override
    String getPrefix() {
        return "추측";
    }
}
