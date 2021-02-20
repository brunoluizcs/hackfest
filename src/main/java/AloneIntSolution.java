import java.util.ArrayList;
import java.util.List;

public class AloneIntSolution {

    /* Explicação
    * 1- Pegar o primeiro elemento do array.
    * 2- Verificar se o número atual já está na lista de numeros errados.
    *    Caso esteja, pega o próximo número.
    * 3- Comparar o número atual com os números à frente dele.
    *    Se existir algum número igual, ele é adicionado na lista de números errados.
    *    Caso contrário, é retornado como resposta.
    * 4- Repetir o processo. Caso chegue no último número da lista, ele é retornado. */

    public int execute(int[] array) {
        int currentNumber;
        List<Integer> wrongNumber = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            currentNumber = array[i];
            if (!wrongNumber.contains(currentNumber)) {
                if (i == array.length - 1) return currentNumber;

                for (int j = i+1; j < array.length; j++) {
                    if (currentNumber == array[j]) {
                        wrongNumber.add(currentNumber);
                        break;
                    }
                }

                if (!wrongNumber.contains(currentNumber)) return currentNumber;
            }
        }

        return -1;
    }
}
