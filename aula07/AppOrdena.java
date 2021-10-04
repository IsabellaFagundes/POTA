public class AppOrdena {
    public static void main(String[] args) {
        Ordena ordena = new Ordena(20);

        System.out.println(ordena.show());

        ordena.bubbleSortRec();

        System.out.println(ordena.show());
        System.out.println("Comparações: " + ordena.getCompara());
        
        ordena.bubbleSort();
        System.out.println("Comparações: " + ordena.getCompara());

    }
}
