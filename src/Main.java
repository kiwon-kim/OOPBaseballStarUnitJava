import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. 정답을 생성한다.
        Answer answer = new Answer();
        answer.create();
        answer.print();

        int tryCount = 0;

        while (true) {
            tryCount++;

            // 2. 추측을 입력받는다.
            Guess guess = new Guess();
            guess.input();
            guess.print();

            // 3. 결과를 계산한다.
            Result result = new Result();
            result.calculate(answer, guess);

            // 4. 결과를 출력한다.
            System.out.println(result.getText());

            // 5. 3S 아니면 2번으로 돌아간다.
            if (result.isCorrect())
                break;
        }

        // 6. 도전횟수를 출력한다.
        System.out.println(String.format("Count : %d", tryCount));
    }
}
