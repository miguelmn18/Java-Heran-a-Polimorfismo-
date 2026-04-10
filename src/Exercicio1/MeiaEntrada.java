package Exercicio1;

public class MeiaEntrada extends  Ingresso{

    public MeiaEntrada(Ingresso ingresso) {
        super(ingresso.getNomeFilme(),ingresso.getValor(),ingresso.getDublado(), ingresso.getLegendado());
    }

    public int valorMeiaEntrada(){
        return getValor()/2;
    }

}
