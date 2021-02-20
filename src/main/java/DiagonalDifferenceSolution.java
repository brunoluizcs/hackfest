import java.util.List;

public class DiagonalDifferenceSolution {

    /* Explicação
     * 1- Estabelecer o index inicial para a diagonal princiapl e para secundária.
     *    Princial começando em 0 e secundária no último index da lista.
     * 2- Somar o número no index da diagonal principal.
     * 3- Somar o número no index da diagonal secundária.
     * 3- Incrementar o valor do index da diagonal principal.
     * 4- Decrementar o valor do index da diagonal secundária.
     * 5- Realizar a subtração e aplicar a função de valor absoluto. */

    public int execute(List<List<Integer>> args) {

        int size = args.size();
        int firstDiagonalIndex = 0;
        int secondDiagonalIndex = size - 1;
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int i = 0; i < size; i++) {
            sumFirstDiagonal += args.get(i).get(firstDiagonalIndex);
            sumSecondDiagonal += args.get(i).get(secondDiagonalIndex);
            firstDiagonalIndex++;
            secondDiagonalIndex--;
        }

        int diff = sumFirstDiagonal - sumSecondDiagonal;
        return Math.abs(diff);
    }
}
