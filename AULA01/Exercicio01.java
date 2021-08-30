import java.util.Scanner;

public class Exercicio01 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //recebe a entrada de dados
        int numLampadas; //variável que vamos receber
        boolean [] lampadas; //lampadas é um vetor estático de boolean

        System.out.println("Quantas lampadas?");
        numLampadas = entrada.nextInt();
        
        lampadas = new boolean[numLampadas]; 
        //criamos o vetor, e esse vetor tem o tamanho "numlampadas"


        //inicia todas as lampadas apagadas
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = false; 
        }

        //o numero de vezes que ele caminha é o mesmo numero de lampadas
        //caminhada = 1 porque não podemos dividir por 0
        for (int caminhada = 1; caminhada <= lampadas.length; caminhada++) {
            for (int lampada = 1; lampada <= lampadas.length; lampada++){ //lampada = 1 porque não temos lampada 0
                if(lampada % caminhada == 0){ //vendo se o numero de lampadas é divisivel por caminhada
                    
                    //lampada - 1, pois a primeira lampada está na posição 0 no vetor
                    lampadas[lampada-1] = ! lampadas[lampada-1]; 
                    //aqui ele inverte, o que estava ligado ele liga, e vice e versa

                    //lampadas[lampada -1] é igual a falso
                    //!lampadas[lampada -1] é igual a verdadeiro
                    //Então lampadas[lampada-1] (FALSO) = !lampadas[lampada-1] (VIRA VERDADEIRO)                
                }
            }
        }

        for (int i = 0; i < lampadas.length; i++) {
            System.out.print(lampadas[i] + " ");
        }

        entrada.close();
    }
}
