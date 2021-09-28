
public class VetorPesquisa {
    private int[] v;
    private int contarCompara;

    public VetorPesquisa(int[] v) { //recebe o vetor
        this.v = v; //e passa como parâmetro para poder acessar e fazer a busca
    }

    public int getContarCompara() { //permite ler o valor (não permite alterar)
        return contarCompara;
    }


    //complexidade log n porque vai dividindo por 2 a cada passo
    //o crescimento do tempo de execução não é tão grande conforme aumentamos o n
    public int pesquisaBinaria(int chave) {
        int inicio, fim, meio;

        inicio = 0;
        fim = v.length - 1;
        contarCompara = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contarCompara++; //incrementa o contador
            if (chave == v[meio]) {
                return meio;
            }
            contarCompara++; //incrementa o contador
            if (chave < v[meio]) { // trocar para '>' se ordenado decrescente
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public int pesquisaBinariaRec(int chave) {//sobre carga do método, para não precisar passar o inicio e o fim no app
        contarCompara = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)
        return pesquisaBinariaRec(chave, 0, v.length - 1); //inicio na chamada do método é sempre 0 e o fim é sempre o tamanho do vetor -1
        //assim o usuário só precisa inserir a chave
    }

    private int pesquisaBinariaRec(int chave, int inicio, int fim) {//as variáveis devem vir como parâmetro pois conforme o algoritmo for executado esses valores mudam
        int meio;

        // caso base - não encontrei
        if (inicio > fim) {
            return -1;
        }

        // caso base - encontrei
        meio = (inicio + fim) / 2;
        contarCompara++;  //incrementa o contador
        if (chave == v[meio]) {
            return meio;
        }

        // caso geral 
        contarCompara++;  //incrementa o contador
        if (chave < v[meio]) { //se a chave é menor devemos mexer no fim
            return pesquisaBinariaRec(chave, inicio, meio - 1); //o inicio não muda e o final vira "meio-1"
        } else { //se a chave é maior devemos mexer no inicio
            return pesquisaBinariaRec(chave, meio + 1, fim); //o inicio vida "meio+1" e o fim não muda
        }
    }


    //algoritmo da semana passada para comparar os desempenhos
    public int buscaSeq(int key) {
        contarCompara = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)
        for (int i = 0; i < v.length; i++) {
            contarCompara++;  //incrementa o contador
            if (key == v[i]) {
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }

    public int buscaSeqRec(int key) {
        contarCompara = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)
        return buscaSeqRec(key, v.length);
    }
    
    // Escreva a versão recursiva do método BuscaSequencial
    private int buscaSeqRec(int key, int tam) {
        if (tam == 0) { // caso base (não achou)
            return -1;
        }
        contarCompara++;  //incrementa o contador
        if (v[tam - 1] == key) { // caso base (achou)
            return tam - 1;
        }

        // geral
        return buscaSeqRec(key, tam - 1);
    }

}
