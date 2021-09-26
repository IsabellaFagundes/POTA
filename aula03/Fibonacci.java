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
        /* if (n == 0 || n == 1) se n for 0 retorna 0, se n for 1 retorna 1
        return n; */
        if (n < 2) //como não temos fibonacci de numero negativo, sendo <2 só pode ser 0 ou 1
            return n; //e deve retornar o próprio n

        int fib = 0;

        //Precisamos saber os dois fibonacci anteriores, e os dois primeiros é necessáriamente 0 e 1.
        //Seguindo a lógica de que fibonacci de 0 é 0 e de 1 é 1
        int ant1 = 0;
        int ant2 = 1;

        for (int i = 2; i <= n; i++) { //começa em 2 porque antes disso fizemos em cima
            fib = ant1 + ant2; //por definição é os dois fibonacci anteriores
            ant1 = ant2; //Como descobrimos um novo fibonacci, então o anterior 1, passa a ser o anterior 2
            ant2 = fib; //e aqui o anterior 2 passa a ser o fibonacci que descobrimos agora
            //se não mudarmos os anteriores, sempre iremos calcular o mesmo número
        }
        return fib;
    }

    public static int fibonacciRec(int n) {
       
        //caso base
        if (n < 2)
            return n;

        //caso geral
        return fibonacciRec(n-1) + fibonacciRec(n-2); //fazemos a chamada recursiva 2x
        //basta pegarmos o fibonacci do numero anterior, mais o fibonacci do anterior do anterior 
        //Neste caso ele sempre vai fazer o N-1 primeiro, depois de encontrá-lo ele irá fazer o N-2
    }
}
