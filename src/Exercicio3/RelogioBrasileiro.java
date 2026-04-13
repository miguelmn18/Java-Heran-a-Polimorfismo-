package Exercicio3;

public class RelogioBrasileiro extends Relogio{

    private int horaConvertida;
    private String periodo;

    public RelogioBrasileiro(Relogio relogio) {
        super(relogio.getHoras(),relogio.getMinutos(), relogio.getSegundos());
    }

    public String formatarHoraBrasileira(){

        if(getHoras() >= 7 && getHoras() <= 12){
            horaConvertida = getHoras();
            periodo = " DA MANHÃ";
        }
        else if(getHoras() >=12 && getHoras() <= 18){
            horaConvertida = getHoras();
            periodo = " DA TARDE";
        } else if (getHoras() >= 0 && getHoras() <= 5) {
            horaConvertida = getHoras();
            periodo = " DA MADRUGADA";
        } else if (getHoras() >= 18 && getHoras() <= 23) {
            horaConvertida = getHoras();
            periodo = " DA NOITE";
        }
            return String.format("%02d:%02d:%02d %s",horaConvertida, getMinutos(),getSegundos(), periodo);
    }
}
