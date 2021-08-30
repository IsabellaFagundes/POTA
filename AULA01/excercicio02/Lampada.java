package excercicio02;

public class Lampada {
    private boolean estado; //todo atributo boolean inicializa em falso


    /*Não é necessário, pelo motivo acima*/
    public Lampada(){
        estado = false;
    }

    public void acionar(){ //troca a lampada de aceso para apagado e vice e versa
        estado = !estado;
    }

    public String getEstado(){
        return (estado)?"On":"Off"; //um if else resumido
    }

}
