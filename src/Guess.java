import java.util.ArrayList;
import java.util.Scanner;

public class Guess {
    ArrayList<Integer> numbers = new ArrayList<>();

    void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Constant.DIGIT; i++)
            numbers.add(scanner.nextInt()); // parsing
    }

    void print() {
        System.out.println("[추측]");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();
    }

    public int get(int index) {
        return numbers.get(index);
    }
}
