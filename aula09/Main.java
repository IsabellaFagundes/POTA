public class Main {
    public static void main(String[] args) {
        final int TAM_VETOR = 20;
        int[] v = new int[TAM_VETOR];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * TAM_VETOR);
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        Ordena.quickSort(v, Ordena.Tipo.DECRESCENTE);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
