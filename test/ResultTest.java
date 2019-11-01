import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    Result result = new Result();
    Answer answer = new Answer();
    Guess guess = new Guess();

    @BeforeEach
    void setUp() {
        answer.create(); // 0 8 9
    }

    @Test
    void 같은_숫자가_같은_자리에_있으면_스트라이트() {
        guess.setNumbers(0, 1, 2);

        result.calculate(answer, guess);

        assertEquals(1, result.getStrike());
    }

    @Test
    void 같은_숫자가_다른_자리에_있으면_볼() {
        guess.setNumbers(1, 0, 2);

        result.calculate(answer, guess);

        assertEquals(1, result.getBall());
    }

    @Test
    void 같은_숫자가_없으면_아웃() {
        guess.setNumbers(1, 2, 3);

        result.calculate(answer, guess);

        assertEquals(3, result.getOut());
    }
}