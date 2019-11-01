import java.util.ArrayList;
import java.util.Scanner;

class Guess {
    private ArrayList<Integer> numbers = new ArrayList<>();

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

    int get(int index) {
        return numbers.get(index);
    }
}
