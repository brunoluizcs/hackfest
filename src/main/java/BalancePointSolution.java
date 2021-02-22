import java.util.ArrayList;

public class BalancePointSolution {

    public int execute(int[] args) {

        // Declaração e atribuição de valor inicial do array principal (list)
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= args.length - 1 ; i++) {
            list.add(args[i]);
        }

        // Declaração e atribuição de valor inicial das variáveis
        int cursor = 1;                         // Variável auxiliar que irá percorrer os índices do array principal.
        int somaEsquerda = 0;                   // Variável que recebe a soma os valores a esquerda do cursor de referência.
        int somaDireita = 0;                    // Variável que recebe a soma os valores a direita do cursor de referência.
        int indiceArray = -1;                   // Variável auxiliar que retorna o valor do cursor.
        int tamanhoArray = (list.size() - 1);   // Variável que recebe o tamanho de posições do array.

        // Verifica se o array existe posições acima de 0.
        if (tamanhoArray > 0){

            // Percorrendo o array.
            for (int k = 0; k < tamanhoArray - 1; k++){

                // Soma o lado esquerdo ao cursor (Ponto de balanço).
                for (int i = 0; i < cursor; i++){
                    somaEsquerda = somaEsquerda + list.get(i);
                }

                // Soma o lado direito ao cursor (Ponto de balanço).
                for (int i = tamanhoArray; i > cursor; i--){
                    somaDireita = somaDireita + list.get(i);
                }

                // Verifica se o valor das somas são iguais.
                if (somaEsquerda == somaDireita){
                    indiceArray = cursor; // Atualiza a variável indiceArray com o valor do cursor (Ponto de balanço)
                }

                cursor = cursor + 1; // Atribuição +1 a variável cursor.
                somaEsquerda = 0;    // Atribuição 0 a variável somaEsquerda.
                somaDireita = 0;     // Atribuição 0 a variável somaDireita

            }
        }

        // Retorno  do (Ponto de balanço)
        return indiceArray;
    }
}
