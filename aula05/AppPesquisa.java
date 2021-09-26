public class AppPesquisa {
    public static void main(String[] args) {
        final int TAM_VETOR = 20;
        int[] vetor = new int[TAM_VETOR];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * TAM_VETOR);
        }

        VetorPesquisa pesquisa = new VetorPesquisa(vetor);

        System.out.println(pesquisa.exibirVetor());

        int chave = 8;

        System.out.println("Busca do valor: " + chave);
        
        System.out.println(pesquisa.buscaSeq(chave));
        System.out.println("Comparações: " + pesquisa.getComparacoes());

        System.out.println("Todos: " + pesquisa.buscaSeqTodas(chave));
        System.out.println("Comparações: " + pesquisa.getComparacoes());

        System.out.println("Recursivo: " + pesquisa.buscaSeqRec(chave));
        
        pesquisa.gerarVetorOrdenado();
        System.out.println(pesquisa.exibirVetor());
        System.out.println("Busca 8: " + pesquisa.buscaSeqOrdenado(chave));
        System.out.println("Comparações: " + pesquisa.getComparacoes());
        System.out.println("Busca 8: " + pesquisa.buscaSeqOrdenado(chave+1));
        System.out.println("Comparações: " + pesquisa.getComparacoes());
    }

}

