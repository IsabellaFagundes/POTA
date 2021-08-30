public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println(fibonacciRec(0));
        System.out.println(fibonacciRec(1));
        System.out.println(fibonacciRec(2));
        System.out.println(fibonacciRec(3));
        System.out.println(fibonacciRec(4));
        System.out.println(fibonacciRec(5));
    }

    public static int fibonacci(int n) {
        /* if (n == 0 || n == 1)
        return n; */
        if (n < 2)
            return n;

        int fib = 0;
        int ant1 = 0;
        int ant2 = 1;

        for (int i = 2; i <= n; i++) { //começa em 2 porque antes disso fizemos em cima
            fib = ant1 + ant2;
            ant1 = ant2;
            ant2 = fib;
        }
        return fib;
    }

    public static int fibonacciRec(int n) {
       
        //caso base
        if (n < 2)
            return n;

        //caso geral
        return fibonacciRec(n-1) + fibonacciRec(n-2);      
        
    }
}
