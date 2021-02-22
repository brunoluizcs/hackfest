import java.util.List;

public class DiagonalDifferenceSolution {

    public int execute(List<List<Integer>> args) {

        // Declaração e atribuição de valor inicial das variáveis
        int arraySize = args.size();                                // Variável que registra o tamanho da matriz.
        int diagonalPrincipal = 0;                                  // Variável que registra a soma da diagonal principal da matriz.
        int diagonalSecundaria = 0;                                 // Variável que registra a soma da diagonal secundaria da matriz.
        int diagonalSoma = 0;                                       // Variável que registra a diferença entre a diagonal principal x diagonal secundaria.
        int iColuna = 0;                                            // Variável auxiliar que irá percorrer a matriz.

        // Declaração e atribuição de valor da matriz principal.
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i <= arraySize - 1 ; i++) {
            for (int k = 0; k <= arraySize - 1 ; k++) {
                array[i][k] = args.get(i).get(k);
            }
        }

        // Laço que soma a diagonal principal da matriz.
        for(int k=0; k < arraySize; k++) {
            diagonalPrincipal = diagonalPrincipal + array[k][iColuna];
            iColuna = iColuna + 1;
        }

        iColuna = arraySize - 1; // Atribuição para percorrer a diagonal secundaria da matriz.

        // Laço que soma a diagonal secundaria da matriz.
        for(int k=0; k < arraySize; k++) {
            diagonalSecundaria = diagonalSecundaria + array[k][iColuna];
            iColuna = iColuna - 1;
        }

        // Cálculo da diferença entre as 2 diagonais superiores.
        if(diagonalSecundaria >= diagonalPrincipal){
            diagonalSoma = ((diagonalSecundaria) - (diagonalPrincipal));
        }else{
            diagonalSoma = ((diagonalPrincipal) - (diagonalSecundaria));
        }

        // Retorno do resultado.
        return diagonalSoma;
    }
}
