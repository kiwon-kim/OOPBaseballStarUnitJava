import java.util.ArrayList;
import java.util.Random;

public class Answer extends NumberContainer{
    void create() {
        Random random = new Random(0);

        while (true) {
            for (int i = 0; i < Constant.DIGIT; i++)
                numbers.add(random.nextInt(Constant.MAX_NUMBER));

            //TODO : 자릿수에 무관하게 구현하여야 함
            if (get(0) == get(1) || get(1) == get(2) || get(2) == get(1))
                continue;

            break;
        }
    }

    @Override
    void print() {
        System.out.println("[정답]");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();
    }
}
