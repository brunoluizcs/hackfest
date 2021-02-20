import java.util.Arrays;

public class BalancePointSolution {

    /* Explicação
     * 1- Estabelecer um pivô, um próximo index para a esquerda e um para a direita.
     * 2- Estabelecer um subarray, do início do array original até o pivot.
     * 3- Estabelecer um subarray, do pivô até final do array original.
     * 3- Realizar a soma dos elementos em ambos os subarrays.
     * 4- Caso as somas sejam iguais, retorna o pivô.
     *    Caso contrário, é feita uma comparação para saber quem será o próximo index.
     *    Caso o pivô seja o index do meio ou maior que o do meio do array original,
     *    chamamos novamente a função, passando o próximo index da esquerda como pivô e
     *    incrementando o valor do próximo index da esquerda.
     *    Caso o pivô seja menor que o do meio do array original,
     *    chamamos novamente a função, passando o próximo index da direita como pivô e
     *    incrementando o valor do próximo index da direita.
     * 5- Como a ordem de movimento é meio-esquerda-direita, caso o index da direita chegue
     *    ao valor igual ao tamanho do array original, retornamos -1.
     *    Indicando que não existe uma solução.  */

    public int execute(int[] args) {

        int size = args.length;
        int pivot = (size - 1) / 2;
        int nextRightIndex = pivot + 1;
        int nextLeftIndex = pivot - 1;

        return findBalance(args, pivot, nextLeftIndex, nextRightIndex);
    }

    private int findBalance(int[] args, int pivot, int nextLeft, int nextRight) {
        int middle = (args.length - 1) / 2;

        int startLeftArray = 0;
        int endLeftArray = pivot;
        int[] leftSubarray = Arrays.copyOfRange(args, startLeftArray, endLeftArray);

        int startRightArray = pivot + 1;
        int endRightArray = args.length;
        int[] rightSubarray = Arrays.copyOfRange(args, startRightArray, endRightArray);

        int sumLeft = Arrays.stream(leftSubarray).sum();
        int sumRight = Arrays.stream(rightSubarray).sum();

        if (sumLeft == sumRight) return pivot;
        else {
            if (pivot >= middle) {
                int moveLeft = Math.max((nextLeft - 1), 0);
                return findBalance(args, nextLeft, moveLeft, nextRight);
            }
            else { // pivot < middle
                int moveRight = nextRight + 1;
                if (moveRight == args.length) return - 1;
                else return findBalance(args, nextRight, nextLeft, moveRight);
            }
        }
    }

}
