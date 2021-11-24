public class Ordena {
    
    public static enum Tipo {
        CRESCENTE, DECRESCENTE
    }

    private static void troca(int[] v, int indice1, int indice2) {
        int temp = v[indice1];
        v[indice1] = v[indice2];
        v[indice2] = temp;
    }

    private static void quickSorCrescente(int[] v, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = v[ (esq + dir) / 2];

        while ( esq <= dir ) { // enquanto os indices não se cruzarem
            while (v[esq] < pivo) {
                esq++;
            }
            while (v[dir] > pivo) {
                dir--;
            }
            if( esq <= dir ) {
                troca(v, esq, dir);
                esq++;
                dir--;
            }
        }
        if(dir - lo > 0) quickSorCrescente(v, lo, dir); // chamada recursiva do vetor à esquerda
        if(hi - esq > 0) quickSorCrescente(v, esq, hi); // chamada recursiva do vetor à direita
    }

    private static void quickSorDecrescente(int[] v, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = v[ (esq + dir) / 2];

        while ( esq <= dir ) { // enquanto os indices não se cruzarem
            while (v[esq] > pivo) {
                esq++;
            }
            while (v[dir] < pivo) {
                dir--;
            }
            if( esq <= dir ) {
                troca(v, esq, dir);
                esq++;
                dir--;
            }
        }
        if(dir - lo > 0) quickSorDecrescente(v, lo, dir); // chamada recursiva do vetor à esquerda
        if(hi - esq > 0) quickSorDecrescente(v, esq, hi); // chamada recursiva do vetor à direita
    }

    public static void quickSort(int[] v, Tipo tipo) {
        if(tipo == Tipo.CRESCENTE)
            quickSorCrescente(v, 0, v.length-1);
        else
            quickSorDecrescente(v, 0, v.length-1);
    }

}

