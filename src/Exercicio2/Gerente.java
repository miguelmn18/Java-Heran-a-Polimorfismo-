package Exercicio2;

import java.util.Objects;
import java.util.Scanner;

public class Gerente {
    private String nome;
    private int senha;
    private String email;
    private boolean adm = true;

    public Gerente(String nome, String email, int senha, boolean adm) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", senha=" + senha +
                ", email='" + email + '\'' +
                ", adm=" + adm +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gerente gerente = (Gerente) o;
        return senha == gerente.senha && adm == gerente.adm && Objects.equals(nome, gerente.nome) && Objects.equals(email, gerente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, senha, email, adm);
    }

    public String geraRelatorioFinanceiro (Vendedor vendas, Atendente atendente){
        String relatorio =
                "RELATÓRIO FINANCERIO\n" +
                "Quantidade de vendas: " + vendas.getQuantidadeDeVendas() + "\n"+
                "Quantidade em caixa: " + atendente.getQuantdEmCaixa();
        return relatorio;

    }

    public int consultarVendas (Vendedor vendas){
        return vendas.getQuantidadeDeVendas();

    }

    public String realizarLogin(String email, int senha){
        if(email.equals(getEmail()) && senha == getSenha()){
            return "Olá, " + getNome();

        }
        return "Senha ou email incorretos";

    }


    //public String refazerLogoff(){}

    public String alterarDados (String nome, String email, int senha){
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        String menu = "Dados alterados com sucesso!\n" +
                "Nome: " + getNome() +
                "Email: " + getEmail() +
                "Senha: " + getSenha();

        return menu;

    }

    public String alterarSenha (int senha){
       setSenha(senha);
       return "Senha alterada com sucesso! ";
    }


}
