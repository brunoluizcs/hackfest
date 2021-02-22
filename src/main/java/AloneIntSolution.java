public class AloneIntSolution {

    public int execute(int[] array) {

        boolean numeroRepetido = false;

        for (int i = 0; i <= array.length - 1 ; i++) {
            for (int k = 0; k <= array.length - 1 ; k++) {
                if (i != k)
                    if (array[i] == array[k])
                        numeroRepetido = true;
            }
            if (numeroRepetido == false) {
                return array[i];
            }
            numeroRepetido = false;
        }

        return 0;
    }
}
