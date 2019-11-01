import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Answer extends NumberContainer{
    void create() {
        Random random = new Random(0);

        while (true) {
            for (int i = 0; i < Constant.DIGIT; i++)
                numbers.add(random.nextInt(Constant.MAX_NUMBER));

            Set<Integer> set = toSet();
            if (set.size() != Constant.DIGIT)
                continue;

            break;
        }
    }

    @Override
    String getPrefix() {
        return "정답";
    }
}
