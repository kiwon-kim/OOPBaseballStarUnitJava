import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class AnswerTest {
    @Test
    void 서로_중복되지_않는_N개의_숫자가_나와야_함(){
        Answer answer = new Answer();
        answer.create();
        Set<Integer> numbers = answer.toSet();

        assertEquals(3, numbers.size());
    }

    @Test
    void 공격을_받으면_쉴드가_먼저_감소한_후_HP가_감소함(){
        // TDD
        Zealot zealot = new Zealot(); // 100 / 50
        zealot.getDamaged(70);

        assertEquals(0, zealot.getShield());
        assertEquals(80, zealot.getHp());
    }
}
