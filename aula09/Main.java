public class Main {
    public static void main(String[] args) {
        final int TAM_VETOR = 20;
        int[] v = new int [TAM_VETOR];
    
    for (int i = 0; i < v.length; i++){
       v[i] = (int) (Math.random() * TAM_VETOR);
    }

    for (int i = 0; i < v.length; i++){
        System.out.println(v[i] + " ");
    }

    System.out.println();
    
    Ordena.quickSort(v);

    for (int i = 0; i < v.length; i++){
        System.out.println(v[i] + " ");
    }
    System.out.println();
    }
}
