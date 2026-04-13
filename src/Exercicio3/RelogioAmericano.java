package Exercicio3;

public class RelogioAmericano extends Relogio{

    private Relogio relogio;
    private int hora24 = 15;
    //private int hora12;

    public RelogioAmericano(Relogio relogio) {
        super(relogio.getHoras(), relogio.getMinutos(), relogio.getSegundos());
    }

    public String formatarHoraAmericana() {
        int horaConvertida;
        String periodo;

        if (getHoras() == 0) {
            horaConvertida = 12;
            periodo = "AM";
        } else if (getHoras() < 12) {
            horaConvertida = getHoras();
            periodo = "AM";
        } else if (getHoras() == 12) {
            horaConvertida = 12;
            periodo = "PM";
        } else {
            horaConvertida = getHoras() - 12;
            periodo = "PM";
        }

        return String.format("%02d:%02d:%02d %s", horaConvertida, getMinutos(), getSegundos(), periodo);
    }
}
