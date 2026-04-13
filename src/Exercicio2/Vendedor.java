package Exercicio2;

import Exercicio1.Ingresso;

import java.util.Objects;

public class Vendedor extends Gerente{
    private int quantidadeDeVendas;
    private double totalVendas;


    public Vendedor(Gerente gerente) {
        super(gerente.getNome(),gerente.getEmail(), gerente.getSenha(), gerente.isAdm());
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return quantidadeDeVendas == vendedor.quantidadeDeVendas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantidadeDeVendas);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "quantidadeDeVendas=" + quantidadeDeVendas +
                '}';
    }

    public int realizarVenda (){
        return quantidadeDeVendas++;

    }


    public String consultarVendas () {
        return "O vendedor realizou " + quantidadeDeVendas + " vendas!";
    }




}
