public class Main {

    public static void main(String[] args) {
        final int TAM_VETOR = 10;
        int[] vetor = new int[TAM_VETOR];        

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * TAM_VETOR);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();    
        
        // Ordena.insertionSort(vetor);
        Ordena.selectionSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
