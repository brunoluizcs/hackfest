import javafx.util.Pair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AlgorithmTest {

    private AloneIntSolution aloneIntAlgorithm = new AloneIntSolution();
    private BalancePointSolution balancePointAlgorithm = new BalancePointSolution();
    private DiagonalDifferenceSolution  diagonalDifferenceAlgorithm = new DiagonalDifferenceSolution();
    private LoadArgs loadArgs = new LoadArgs();


    @Test
    public void aloneIntalgorithm_test() {
        List<Pair<int[], Integer>> args = loadArgs.loadArgsToAloneInt();

        for(Pair<int[], Integer> arg: args) {
            int result = aloneIntAlgorithm.execute(arg.getKey());
            assertEquals((int) arg.getValue(), result);
        }
    }

    @Test
    public void balancePointAlgorithm_test() {
        List<Pair<int[], Integer>> args = loadArgs.loadArgsToBalancePoint();

        for(Pair<int[], Integer> arg: args) {
            int result = balancePointAlgorithm.execute(arg.getKey());
            assertEquals((int) arg.getValue(), result);
        }
    }

    @Test
    public void diagonalDifferenceAlgorithm_test() {
        List<Pair<List<List<Integer>>, Integer>> args = loadArgs.loadArgsToDiagonalDifference();
        for (Pair<List<List<Integer>>, Integer> arg: args) {
            int result = diagonalDifferenceAlgorithm.execute(arg.getKey());
            assertEquals((int) arg.getValue(), result);
        }
    }
}
