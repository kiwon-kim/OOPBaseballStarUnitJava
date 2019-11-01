import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class NumberContainer {
    protected ArrayList<Integer> numbers = new ArrayList<>();

    // 가상 == 재정의 할 수 있는 (overridable)

    abstract String getPrefix();

    // template method
    void print() {
        System.out.println("[" + getPrefix() + "]");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();
    }

    // wrapper method
    int get(int index) {
        return numbers.get(index);
    }

    Set<Integer> toSet(){
        return new HashSet<>(numbers);
    }
}
