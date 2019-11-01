import java.util.ArrayList;

class Result {
    private int strike = 0;
    private int ball = 0;
    private int out = 0;

    boolean isCorrect() {
        return strike == Constant.DIGIT;
    }

    //TODO : toString()
    String getText() {
        return String.format("S:%d B:%d O:%d", strike, ball, out);
    }

    void calculate(Answer answer, Guess guess)
    {
        for (int i = 0; i < Constant.DIGIT; i++) {
            int j = (i + 1) % Constant.DIGIT;
            int k = (i + 2) % Constant.DIGIT;

            if (answer.get(i) == guess.get(i))
                strike++;
            else if (answer.get(i) == guess.get(j) || answer.get(i) == guess.get(k))
                ball++;
            else
                out++;
        }
    }
}
