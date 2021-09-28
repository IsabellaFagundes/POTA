
public class VetorPesquisa {
    private int[] v;
    private int contarCompara;

    public VetorPesquisa(int[] v) {
        this.v = v;
    }

    public int getContarCompara() {
        return contarCompara;
    }

    public int pesquisaBinaria(int chave) {
        int inicio, fim, meio;

        inicio = 0;
        fim = v.length - 1;
        contarCompara = 0;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contarCompara++;
            if (chave == v[meio]) {
                return meio;
            }
            contarCompara++;
            if (chave < v[meio]) { // trocar para '>' se ordenado decrescente
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public int pesquisaBinariaRec(int chave) {
        contarCompara = 0;
        return pesquisaBinariaRec(chave, 0, v.length - 1);
    }

    private int pesquisaBinariaRec(int chave, int inicio, int fim) {
        int meio;

        // caso base - não encontrei
        if (inicio > fim) {
            return -1;
        }

        // caso base - encontrei
        meio = (inicio + fim) / 2;
        contarCompara++;
        if (chave == v[meio]) {
            return meio;
        }

        // caso geral 
        contarCompara++;
        if (chave < v[meio]) {
            return pesquisaBinariaRec(chave, inicio, meio - 1);
        } else {
            return pesquisaBinariaRec(chave, meio + 1, fim);
        }
    }

    public int buscaSeq(int key) {
        contarCompara = 0;
        for (int i = 0; i < v.length; i++) {
            contarCompara++;
            if (key == v[i]) {
                return (i); // posição no vetor
            }
        }
        return (-1); // Não encontrou
    }

    public int buscaSeqRec(int key) {
        contarCompara = 0;
        return buscaSeqRec(key, v.length);
    }
    
    // Escreva a versão recursiva do método BuscaSequencial
    private int buscaSeqRec(int key, int tam) {
        if (tam == 0) { // caso base (não achou)
            return -1;
        }
        contarCompara++;
        if (v[tam - 1] == key) { // caso base (achou)
            return tam - 1;
        }

        // geral
        return buscaSeqRec(key, tam - 1);
    }

}
