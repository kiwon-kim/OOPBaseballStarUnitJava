import java.util.ArrayList;
import java.util.Random;

public class Answer {
    private ArrayList<Integer> numbers = new ArrayList<>();

    void create() {
        Random random = new Random(0);

        while (true) {
            for (int i = 0; i < Constant.DIGIT; i++)
                numbers.add(random.nextInt(Constant.MAX_NUMBER));

            //TODO : 자릿수에 무관하게 구현하여야 함
            if (numbers.get(0) == numbers.get(1) || numbers.get(1) == numbers.get(2) || numbers.get(2) == numbers.get(1))
                continue;

            break;
        }
    }

    void print() {
        System.out.println("[정답]");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();
    }

    // wrapper method
    int get(int index) {
        return numbers.get(index);
    }
}
