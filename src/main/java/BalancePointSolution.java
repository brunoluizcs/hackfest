import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BalancePointSolution {

    public int execute(int[] args) {
        int higherIndex = 0, lowerIndex = 0, result = -1;

        List<Integer> collect = Arrays.stream(args).boxed().collect(Collectors.toList());
        for (int x = 0; x < collect.size(); x++) {
            higherIndex = collect.subList(x + 1, collect.size()).stream().reduce(0, Integer::sum);
            if(x != 0){
                lowerIndex = collect.subList(0, x).stream().reduce(0, Integer::sum);
            }
            if (higherIndex == lowerIndex) {
                result = x;
                break;
            }
        }
        return result;
    }
}
