public class Exercicio03 {
    public static void main(String[] args) {
        int vet[] = { 1, 7, 2, 10, 1 };

        System.out.println(maior(vet, vet.length));
    }

    public static int maior(int[] v, int tamanho) {
        // base
        if (tamanho == 1)
            return v[0];

        // geral
        int maiorAtual = maior(v, tamanho - 1);
        int valorPosicaoFinal = v[tamanho - 1];

        // return (v[tamanho - 1] > maiorAtual) ? v[tamanho - 1] : maiorAtual;
        return Math.max(maiorAtual, valorPosicaoFinal);
    }
}
