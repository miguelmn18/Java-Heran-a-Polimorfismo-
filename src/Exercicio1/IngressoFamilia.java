package Exercicio1;

public class IngressoFamilia extends Ingresso{
    public IngressoFamilia(Ingresso ingresso) {
        super(ingresso.getNomeFilme(), ingresso.getValor(), ingresso.getLegendado(), ingresso.getDublado());
    }
    public double valorIngressoFamilia (int quantdPessoas){
        if(quantdPessoas >=3) {
            double valorFinal = (getValor() * quantdPessoas) * 0.95;
            return valorFinal;
        }
        return getValor() * quantdPessoas;

    }
}
