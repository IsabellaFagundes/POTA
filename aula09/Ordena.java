public class Ordena {
    private static void troca(int[] v, int indice1, int indice2){
        int temp = v[indice1];
        v[indice1] = v[indice2];
        v[indice2] = temp;
    }

    private static void quickSort(int[] v, int lo, int hi) {
        int esq = lo;
        int dir = hi;
        int pivo = v[ (esq + dir) / 2];

        while (esq <= dir) {
            while (v[esq] < pivo){
                esq++;
            }
            while (v[dir] > pivo){
                dir --; 
            }
            
            if (esq <= dir) {
                troca (v, esq, dir);
                esq ++;
                dir --;
                
            }
        }
        if (dir - lo > 0) quickSort(v, lo, dir);
        if (hi - esq > 0) quickSort(v, lo, esq);
    }
}
