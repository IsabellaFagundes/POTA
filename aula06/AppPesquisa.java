public class AppPesquisa {
    public static void main(String[] args) {
            final int TAM_VETOR = 10000; //tamanho do vetor
            int [] vet = new int[TAM_VETOR]; //cria o vetor

            for (int i = 0; i < vet.length; i++) {
                vet[i] = i * 2; //preenche o vetor com multiplos de 2
                //System.out.print(vet[i] + " ");
            }

            int chave = 333333;
            
            VetorPesquisa pesquisa = new VetorPesquisa(vet); //criando o objeto, como parâmetro o vetor
            System.out.println("\nposição: " + pesquisa.pesquisaBinaria(chave));
            System.out.println("Comparações: " + pesquisa.getContarCompara()); //chama o método que mostra o número de comparações
            System.out.println("\nposição: " + pesquisa.buscaSeqRec(chave));
            System.out.println("Comparações: " + pesquisa.getContarCompara()); //chama o método que mostra o número de comparações
    }
}
