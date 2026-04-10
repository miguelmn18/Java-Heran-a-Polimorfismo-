package Exercicio1;

import java.util.Objects;

public class Ingresso {

    private String nomeFilme;
    private int valor;
    private boolean legendado;
    private boolean dublado;

    public Ingresso(String nomeFilme, int valor, boolean legendado, boolean dublado) {
        this.nomeFilme = nomeFilme;
        this.valor = valor;
        this.legendado = legendado;
        this.dublado = dublado;

    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean getLegendado() {
        return legendado;
    }


    public boolean getDublado() {
        return dublado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingresso ingresso = (Ingresso) o;
        return valor == ingresso.valor && legendado == ingresso.legendado && dublado == ingresso.dublado && Objects.equals(nomeFilme, ingresso.nomeFilme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeFilme, valor, legendado, dublado);
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "nomeFilme='" + nomeFilme + '\'' +
                ", valor=" + valor +
                ", legendado=" + legendado +
                ", dublado=" + dublado +
                '}';
    }
}
