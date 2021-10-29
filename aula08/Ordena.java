public class Ordena {
    private int numeroComparacoes;

    public int getNumeroComparacoes() {
        return numeroComparacoes;
    }

    public static void insertionSort(int[] lista) {
        int atual;
        for (int i = 1; i < lista.length; i++) {
            atual = lista[i];
            int j = i - 1;
            while ((j >= 0) && (lista[j]) > atual) {
                lista[j + 1] = lista[j]; // copia o valor para a direita da posição atual (j)
                j--;
            }
            lista[j + 1] = atual;
        }
    }

    public static void selectionSort(int[] lista) {
        int indiceMenor;
        for (int indiceAtual = 0; indiceAtual < lista.length; indiceAtual++) {
            indiceMenor = indiceAtual;
            for (int indiceCompara = indiceAtual + 1; indiceCompara < lista.length; indiceCompara++) {
                if (lista[indiceCompara] < lista[indiceMenor]) {
                    indiceMenor = indiceCompara;
                }
            }
            swap(lista, indiceMenor, indiceAtual);
        }
    }

    private static void swap(int[] lista, int indiceMenor, int indiceAtual) {
        int aux = lista[indiceAtual];
        lista[indiceAtual] = lista[indiceMenor];
        lista[indiceMenor] = aux;
    }

}

