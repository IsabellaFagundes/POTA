
public class Exercicio01 {
  
    public static void main(String[] args) {
        System.out.println(multiplicaRec(3, 0));
        System.out.println(multiplicaRec(3, 1));
        System.out.println(multiplicaRec(3, 4));
    }

    public static int multiplica(int a, int b){
        int produto = 0;

        for (int i = 0; i < b; i++) { //o for vai correr x vezes, o valor do b
            produto += a;   //enquanto o for correr, vai somar o valor do a          
        }

        return produto;
    }



    public static int multiplicaRec (int a, int b){
        //caso base
        if(b == 0) return 0; //multiplicação por 0 é zero
        //caso geral
        //return a+(b-1)*a;
        return a + multiplicaRec(a, b-1); //vai retornar o valor do + a multiplicação do a vezes o b-1
    }
}