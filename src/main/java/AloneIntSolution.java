import java.util.Arrays;
import java.util.function.Predicate;

public class AloneIntSolution {

    public int execute(int[] array) {
        Predicate<Integer> uniqueNumberCount = value -> {
            long occurrences = Arrays.stream(array)
                    .filter(value::equals)
                    .count();
            return occurrences == 1;
        };

        return Arrays.stream(array)
                .filter(uniqueNumberCount::test)
                .sum();
    }
}
