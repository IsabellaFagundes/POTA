
public class VetorPesquisa {
    private int[] v;
    private int comparacoes;

    public VetorPesquisa(int[] v) {
        if (v != null) {
            this.v = v;
        } else {
            v = new int[10];
        }
    }

    public VetorPesquisa(int tam) {
        v = new int[tam];
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public void gerarVetor() {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * v.length);
        }
    }

    public void gerarVetorOrdenado() {
        for (int i = 0; i < v.length; i++) {
            v[i] = i * 2;
        }
    }

    public String exibirVetor() {
        String aux = "";
        for (int numero : v) {
            aux += numero + " ";
        }
        return aux;
    }

    public int buscaSeq(int key) {
        comparacoes = 0;
        for (int i = 0; i < v.length; i++) {
            comparacoes++;
            if (key == v[i]) {
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }

    // um método que retorna todas as posições da chave
    public String buscaSeqTodas(int key) {
        comparacoes = 0;
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            comparacoes++;
            if (key == v[i]) {
                aux += i + " ";
            }
        }
        return (aux.length() > 0) ? aux : "-1";
    }

    // um método que sabe que o vetor está ordenado ?
    // 2 4 5 7 8 9 10 {k = 6}
    public int buscaSeqOrdenado(int key) {
        comparacoes = 0;
        for (int i = 0; i < v.length && (key >= v[i]); i++) {
            comparacoes++;
            if (key == v[i]) {
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }

    public int buscaSeqRec(int key) {
        return buscaSeqRec(key, v.length);
    }
    
    // Escreva a versão recursiva do método BuscaSequencial
    private int buscaSeqRec(int key, int tam) {
        if (tam == 0) { // caso base (não achou)
            return -1;
        }
        if (v[tam - 1] == key) { // caso base (achou)
            return tam - 1;
        }

        // geral
        return buscaSeqRec(key, tam - 1);
    }
}

