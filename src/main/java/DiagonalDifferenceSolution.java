import java.util.List;

public class DiagonalDifferenceSolution {
    public int execute(List<List<Integer>> args) {
        int n = args.size(), a = 0, b = 0;

        for (int x = 0; x < n; x++) {
            a += args.get(x).get(x);
            b += args.get(x).get((n - 1) - x);
        }
        return Math.abs(a - b);
    }
}
