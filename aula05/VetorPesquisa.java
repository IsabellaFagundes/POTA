
public class VetorPesquisa {
    private int[] v;
    private int comparacoes; //atributo da classe, permite mostrar esse valor no app 

    /*private int v[]; -- slide

    public int buscaSeq(int key) {
        for (int i = 0; i < v.length; i++) {
            if (key == v[i]){
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }*/

    public VetorPesquisa(int[] v) { //validação para garantir que o vetor exista
        if (v != null) {
            this.v = v;
        } else { //caso não existir, cria um vetor com um tamanho 10
            v = new int[10];
        }
    }

    public VetorPesquisa(int tam) { //sobrecarga de métodos, cria um vetor a partir de um número recebido como parâmetro
        v = new int[tam];
    }

    public int getComparacoes() { //permite ler o valor (não permite alterar)
        return comparacoes;
    }

    public void gerarVetor() { //método para gerar o vetor aleatório
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }
    }

    public void gerarVetorOrdenado() { //método para gerar um vetor ordenado
        for (int i = 0; i < v.length; i++) {
            v[i] = i * 2; //gera numeros pares, multiplos de 2
        }
    }

    public String exibirVetor() { //método para exibir o vetor
        String aux = ""; //string auxiliar
        for (int numero : v) {
            aux += numero + " "; //assim ele gera uma lista com o número, um espaço e outro número
        }
        return aux;
    }

    //Algoritmo linear, pior caso Ó grande de N (tamanho do vetor), quanto maior o tamanho do vetor, maior o tempo (linearmente proporcional, aumenta um N, aumenta um no tempo)
    //É um allgoritmo bom, mas não o melhor possível
    public int buscaSeq(int key) { //método para buscar a chave dentro do vetor
        comparacoes = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)
        for (int i = 0; i < v.length; i++) {
            comparacoes++; //incrementa o contador
            if (key == v[i]) {
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }

    // um método que retorna todas as posições que a chave aparece no vetor
    //esse método roda menos vezes que o buscaSeq em média, pois nem sempre vai rodar até o final do vetor
    //o pior caso continua o mesmo, Ó grande de N, e linear
    public String buscaSeqTodas(int key) {
        comparacoes = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)
        String aux = ""; //uma string auxiliar
        for (int i = 0; i < v.length; i++) {
            comparacoes++; //incrementa o contador
            if (key == v[i]) { //aonde achar a chave
                aux += i + " "; //retorne a string com os indices
            }
        }
        return (aux.length() > 0) ? aux : "-1"; //se o tamanho do aux for > 0 retorna aux, caso contrário retorna -1 (vazio)
    }

    // um método que sabe que o vetor está ordenado ?
    // 2 4 5 7 8 9 10 {k = 6}

    //esse método para antes de chegar no final
    //esse método roda menos vezes que o buscaSeqTodas em média
    //o pior caso continua o mesmo, Ó grande de N, e linear
    public int buscaSeqOrdenado(int key) {
        comparacoes = 0; //contador iniciando em 0 ele conta quantas vezes vai entrar no if (numero de comparações)
        for (int i = 0; i < v.length && (key >= v[i]); i++) { //ele verifica se o conteúdo é maior ou igual do que eu estou procurando, se for maior eu posso parar
            comparacoes++; //incrementa o contador
            if (key == v[i]) {
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }


    //ver o método de baixo primeiro para entender
    public int buscaSeqRec(int key) { //sobrecarga do método, para garantir que o usuário não precise inserir o tamanho
        return buscaSeqRec(key, v.length);
    }

    // Escreva a versão recursiva do método BuscaSequencial
    //esse método analisa o vetor do ultimo elemento para o primeiro, do final pro começo
    private int buscaSeqRec(int key, int tam) { //privado para não mudar o tamanho do método
        // caso base (não achou) 
        if (tam == 0) { //0 porque eu percorri do ultimo indice até o indice 0 e não achei
            return -1;
        }

        // caso base (achou)
        if (v[tam - 1] == key) {  //se o tamanho do vetor é 10, o ultimo elemento é o 0, ou seja tam -1 (ultimo elemento do vetor)
            return tam - 1; //então se esse ultimo elemento é o que eu estou procurando, retorna justamente o indice tam -1
        }

        // geral
        return buscaSeqRec(key, tam - 1); //retorno a chamada recursiva passando a chave e o tam - 1)
    }
}
