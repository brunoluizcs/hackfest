import java.util.List;

public class DiagonalDifferenceSolution {
    public int execute(List<List<Integer>> args) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < args.size(); i++) {
            left += args.get(i).get(i);
            right += args.get(i).get(args.get(i).size() - (i + 1));
        }
        int sum = Math.abs(left - right);
        return sum;
    }
}
