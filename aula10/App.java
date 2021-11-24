public class App {
    public static void main(String[] args) {
        final int TAM_MAX_HEAP = 30;

        Heap heap = new Heap(TAM_MAX_HEAP);

        for (int i = 0; i < TAM_MAX_HEAP; i++) {
            int dado =  (int) (Math.random() * TAM_MAX_HEAP);
            heap.insert(new No ( dado ));
        }

        System.out.println("Antes:");
        System.out.println(heap.showHeap());

        heap.heapSort();

        System.out.println("Depois:");
        System.out.println(heap.showHeap());
    }
}
