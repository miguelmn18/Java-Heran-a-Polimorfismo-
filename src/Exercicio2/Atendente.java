package Exercicio2;

public class Atendente extends Gerente{
    private int quantdEmCaixa;

    public Atendente(String nome, String email , int senha, boolean adm ) {
        super(nome, email, senha, adm);

    }

    public int getQuantdEmCaixa() {
        return quantdEmCaixa;
    }

    public void setQuantdEmCaixa(int quantdEmCaixa) {
        this.quantdEmCaixa = quantdEmCaixa;
    }
    public String receberPagamentos (int valor){
        double valorTotal = quantdEmCaixa += valor;
        return "O valor total em caixa é de " + valorTotal;
    }
}
