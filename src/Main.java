import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. 정답을 생성한다.
        ArrayList<Integer> answers = createAnswers();

        int tryCount = 0;

        while (true) {
            tryCount++;

            // 2. 추측을 입력받는다.
            ArrayList<Integer> guesses = inputGuesses();

            // 3. 결과를 계산한다.
            Result result = calculateResult(answers, guesses);

            // 4. 결과를 출력한다.
            System.out.println(String.format("S:%d B:%d O:%d", result.strike, result.ball, result.out));

            // 5. 3S 아니면 2번으로 돌아간다.
            if (result.strike == Constant.DIGIT)
                break;
        }

        // 6. 도전횟수를 출력한다.
        System.out.println(String.format("Count : %d", tryCount));
    }

    private static Result calculateResult(ArrayList<Integer> answers, ArrayList<Integer> guesses)
    {
        Result result = new Result();

        for (int i = 0; i < Constant.DIGIT; i++) {
            int j = (i + 1) % Constant.DIGIT;
            int k = (i + 2) % Constant.DIGIT;

            if (answers.get(i) == guesses.get(i))
                result.strike++;
            else if (answers.get(i) == guesses.get(j) || answers.get(i) == guesses.get(k))
                result.ball++;
            else
                result.out++;
        }

        return result;

    }

    private static ArrayList<Integer> inputGuesses() {
        ArrayList<Integer> guesses = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Constant.DIGIT; i++)
            guesses.add(scanner.nextInt()); // parsing

        printNumbers(guesses, "추측");

        return guesses;
    }

    private static ArrayList<Integer> createAnswers() {
        Random random = new Random(0);

        ArrayList<Integer> answers = new ArrayList<>();

        while (true) {
            for (int i = 0; i < Constant.DIGIT; i++)
                answers.add(random.nextInt(Constant.MAX_NUMBER));

            //TODO : 자릿수에 무관하게 구현하여야 함
            if (answers.get(0) == answers.get(1) || answers.get(1) == answers.get(2) || answers.get(2) == answers.get(1))
                continue;

            break;
        }

        printNumbers(answers, "정답");

        return answers;
    }

    private static void printNumbers(ArrayList<Integer> numbers, String prefix) {
        System.out.println("[" + prefix + "]");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();

    }
}
