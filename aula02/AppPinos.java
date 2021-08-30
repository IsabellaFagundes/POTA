//Resolução iterativa

public class AppPinos {

    public static void main(String[] args) {
        // System.out.println("Para 3 linhas = " + pinosRec(3) );
        System.out.println("Para 4 linhas = " + pinosRec(4) );
        // System.out.println("Para 5 linhas = " + pinosRec(5) );
    }

    public static int pinos(int linhas){
    //queremos que esse método retone o total de pinos, para isso devemos fornecer a quantidade de linhas

        int totalPinos = 0; //valor total de pinos, inicia em 0

        for (int pino = 1; pino <= linhas; pino++) { 
            //a conta começa no 1º pino, até a linha que queremos saber, e vamos somar todos
            //o numero de pinos é equivalente ao numero da linha

            totalPinos += pino;
            // = totalPinos = totalPinos + pino
        }

        return totalPinos;
    }


    public static int pinosRec(int linhas){ //Rec - recursivo
    //Todo método recursivo tem que ter pelo menos duas partes:
    //caso base - problema mais simples que vamos ter (nesse caso 1 linha)
        if(linhas == 1) return 1;

    //caso geral - demais situações
        return linhas + pinosRec(linhas-1);
        //numero de linhas + uma chamada para esse método, mas com linhas - 1

    }
}