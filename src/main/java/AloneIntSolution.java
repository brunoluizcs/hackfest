import java.util.Arrays;
import java.util.stream.Stream;

public class AloneIntSolution {

    public int execute(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int finalI = i;
            if(Arrays.stream(array).filter(f -> f == array[finalI]).count() > 1){
                continue;
            }else{
                return array[i];
            }
        }
        return -1;
    }
}
