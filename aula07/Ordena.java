public class Ordena {
    private int[] v;
    private int compara;

    public Ordena(int tam) { // construtor que iniliza o vetor com um tamanho
        v = new int[tam];
        makeRandon();
    }

    public void makeRandon() { // método para preencher o vetor de forma aleatória
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }
    }

    public int getCompara() {
        return compara;
    }

    /* método bubbleSort padrão
    public void bubbleSort() {
        int iteracao, i, aux;
        for (iteracao = 0; iteracao < v.length - 1; iteracao++)//me dis quantas vezes eu vou percorrer o vetor
        {
            for (i = 0; i < v.length - 1 - iteracao; i++) //percorre o vetor
                if (v[i] > v[i + 1])
                {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
        }
    }*/

    public void bubbleSort() { //método bubbleSort com a troca em um método separado "swap"
        int iteracao, i;

        compara = 0;
        for (iteracao = 0; (iteracao < v.length - 1); iteracao++) {
            for (i = 0; i < v.length - 1 - iteracao; i++) {
                compara++; //colocamos aqui para podermos contar quantas vezes o if acontece
                if (v[i] > v[i + 1]) {
                    swap(i, i + 1); //chama o método swap e passa o valor de i e "j" recebe i+1
                }
            }
        }
    }

    public void bubbleSortOtimizado() {//se o vetor estiver ordenado não há nada para trocar, então não entra no if
        int iteracao, i;
        boolean trocou = true; //inicia em verdadeiro para entrar no laço a primeira vez

        compara = 0;
        for (iteracao = 0; (iteracao < v.length - 1) && trocou; iteracao++) {//enquanto não chegar no fim do vetor e houver troca, continua
            trocou = false; //reinicia a variável para a execução
            for (i = 0; i < v.length - 1 - iteracao; i++) {
                compara++;
                if (v[i] > v[i + 1]) {
                    swap(i, i + 1);
                    trocou = true; //se ela entrou no if, significa que houve uma troca
                }
            }
            // if(!trocou) break; interrompe o laço e o algoritmo para, se em nenhum momento houver troca = já está ordenado
        }
    }

    public void bubbleSortBiDirecional() {
        int iteracao, i;

        compara = 0;
        for (iteracao = 0; (iteracao < v.length / 2); iteracao++) {//porque será feita a metade das iterações, porque agora ordenamos dois numeros de uma vez, ou seja, a metade do tempo
            // leva o maior número para o final do vetor
            for (i = 0; i < v.length - 1 - iteracao; i++) {
                compara++;
                if (v[i] > v[i + 1]) {//compara o numero da direita, e se for maior troca
                    swap(i, i + 1);
                }
            }
            // leva o menor número para o início do vetor
            for (i = v.length - 1 - iteracao; i > iteracao; i--) { //começa do final do vetor e ececuta enquanto esse valor for maior que a iteração 
                compara++;                                          //(ou seja, vai descartando o menor numero, na primeria vez vai até o final, na proxima vai até o 1, e assim por diante), e vai decrementando
                if (v[i] < v[i - 1]) { //compara o numero da esquerda, e se for menor troca
                    swap(i, i - 1);
                }
            }

        }
    }

    public void bubbleSortRec() {
        compara = 0;
        bubbleSortRec(v.length - 1); //valor da variável fim
    }

    private void bubbleSortRec(int fim) {
        for (int i = 0; i < fim; i++) {//roda a primeira vez
            compara++;
            if (v[i] > v[i + 1]) {
                swap(i, i + 1);
            }
        }
        if (fim > 1) {//se fim ainda for maior 1, chama recursivamente o método, mas com um tamanho menor
            bubbleSortRec(fim - 1);
        }
    }

    //extraímos o método de troca, chamamos ele de swap (faz as trocas dos numeros nas posições dentro do vetor)
    private void swap(int i, int j) {//j=i+1
        int aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public String show() {//método de impressão do vetor
        String out = "";
        for (int i = 0; i < v.length; i++) {
            out += v[i] + " ";
        }
        return out;
    }

}
