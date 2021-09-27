public class AppPesquisa {
    public static void main(String[] args) {
        final int TAM_VETOR = 20;
        int[] vetor = new int[TAM_VETOR]; //cria um vetor com tamanho 20

        for (int i = 0; i < vetor.length; i++) { //não tem necessidade desse for, se tivermos o método gerarVetor
            vetor[i] = (int) (Math.random() * TAM_VETOR); //gera os numeros do vetor de forma aleatória, tem numero de 0 a 20 (tamanho do vetor)
        }

        VetorPesquisa pesquisa = new VetorPesquisa(vetor); //faz a passagem da referencia do vetor acima para a classe VetorPesquisa

        System.out.println(pesquisa.exibirVetor()); //aqui eu chamo o método para printar o vetor para o usuário

        int chave = 8; //chave de busca

        System.out.println("Busca do valor: " + chave);
        
        System.out.println(pesquisa.buscaSeq(chave)); //aqui chama o método que pesquisa o valor da chave no vetor
        System.out.println("Comparações: " + pesquisa.getComparacoes()); //exibe a contagem de quantas vezes entrou no if (quantas comparações foram feitas)

        System.out.println("Todos: " + pesquisa.buscaSeqTodas(chave)); //chama o método de pesquisar todas as posições que encontrar a chave
        System.out.println("Comparações: " + pesquisa.getComparacoes()); //exibe a contagem de quantas vezes entrou no if (quantas comparações foram feitas)

        System.out.println("Recursivo: " + pesquisa.buscaSeqRec(chave));
        
        pesquisa.gerarVetorOrdenado(); //chama método que gera o vetor ordenado
        System.out.println(pesquisa.exibirVetor()); //chama método que exibe vetor
        System.out.println("Busca 8: " + pesquisa.buscaSeqOrdenado(chave)); //chama método que pesquisa a chave no vetor ordenado
        System.out.println("Comparações: " + pesquisa.getComparacoes()); //exibe a contagem de quantas vezes entrou no if (quantas comparações foram feitas)
        System.out.println("Busca 8: " + pesquisa.buscaSeqOrdenado(chave+1));
        System.out.println("Comparações: " + pesquisa.getComparacoes()); //exibe a contagem de quantas vezes entrou no if (quantas comparações foram feitas)
    }

}

