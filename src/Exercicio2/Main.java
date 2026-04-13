package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente("Miguel","miguel@gmail.com",1234231, true);
        Vendedor vendas = (Vendedor) new Gerente("Maria","maria@gmail.com",7778996,false);
        Atendente atendente = (Atendente) new Gerente("Pedro","pedro@gmail.com",1190284,false);

        System.out.println(gerente.toString());
        System.out.println("======================");
        System.out.println(gerente.alterarSenha(45678));
        System.out.println(gerente.getSenha());
        System.out.println("====================");
        System.out.println(gerente.alterarDados("Joao","macedo@gmail.com",78901));
        System.out.println(gerente.toString());
        System.out.println("====================");
        System.out.println(gerente.geraRelatorioFinanceiro(vendas,atendente));
        System.out.println("====================");
        System.out.println(vendas.realizarVenda());
        System.out.println(vendas.consultarVendas());
        System.out.println("====================");
        System.out.println(atendente.receberPagamentos(1500));



    }
}
