public class AppPesquisa {
    public static void main(String[] args) {
            final int TAM_VETOR = 10000;
            int [] vet = new int[TAM_VETOR];

            for (int i = 0; i < vet.length; i++) {
                vet[i] = i * 2;
                //System.out.print(vet[i] + " ");
            }

            int chave = 333333;
            
            VetorPesquisa pesquisa = new VetorPesquisa(vet);
            System.out.println("\nposição: " + pesquisa.pesquisaBinariaRec(chave));
            System.out.println("Comparações: " + pesquisa.getContarCompara());
            System.out.println("\nposição: " + pesquisa.buscaSeqRec(chave));
            System.out.println("Comparações: " + pesquisa.getContarCompara());
    }
}
