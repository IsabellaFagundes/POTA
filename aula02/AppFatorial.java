public class AppFatorial {
    public static void main(String[] args) {
        System.out.println("5! = " + fat(5));
        System.out.println("5! = " + fatRec(5));
    }

    public static int fat(int n) {
        int fatorial = 1;

        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static int fatRec(int n) {
        // caso base
        if(n == 0) return 1;
        // caso geral
        return n * fatRec(n-1);
    }

}
