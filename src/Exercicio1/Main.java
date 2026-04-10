package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int escolheFilme;
        int tipoIngresso;
        boolean escolhe = false;
        Ingresso ingresso = new Ingresso("",0, escolhe, escolhe);
        MeiaEntrada meiaEntrada;
        IngressoFamilia ingressoFamilia;

        //Escolhe o filme que ira assistir
        catalogoFilmes();
        escolheFilme = sc.nextInt();
        sc.nextLine();

        switch (escolheFilme){
            case 1:
                ingresso.setNomeFilme("Homem-Aranha: De Volta ao lar");
                ingresso.setValor(50);

                //Informar se o filme é legendado ou dublado
                System.out.println("O filme vai ser legendado ou dublado? ");
                String formatoFilme1 = sc.nextLine();


                //Adiciona a informação ao objeto
                legendadoOuDublado(formatoFilme1.trim(), ingresso);

                // Pausa interativa
                System.out.println("Pressione ENTER para escolher o tipo de ingresso...");
                sc.nextLine(); // espera ENTER

                //Escolhe o tipo do ingresso
                ingressos();
                tipoIngresso = sc.nextInt();
                sc.nextLine();

                //Aqui o usuário será o informado do valor do seu ingresso escolhido
                ingressoEscolhido(tipoIngresso, ingresso, sc);
                System.out.println(ingresso.toString());
                break;


            case 2:
                ingresso.setNomeFilme("Velozes e furioso");
                ingresso.setValor(30);

                //Informar se o filme é legendado ou dublado
                System.out.println("O filme vai ser legendado ou dublado? ");
                String formatoFilme2 = sc.nextLine().strip().toLowerCase();

                //Adiciona a informação ao objeto
                legendadoOuDublado(formatoFilme2, ingresso);

                // Pausa interativa
                System.out.println("Pressione ENTER para escolher o tipo de ingresso...");
                sc.nextLine(); // espera ENTER

                //Escolhe o tipo do ingresso
                ingressos();
                tipoIngresso = sc.nextInt();

                //Aqui o usuário será o informado do valor do seu ingresso escolhido
                ingressoEscolhido(tipoIngresso, ingresso, sc);

                break;

            case 3:
                ingresso.setNomeFilme("Vingadores");
                ingresso.setValor(40);

                //Informar se o filme é legendado ou dublado
                System.out.println("O filme vai ser legendado ou dublado? ");
                String formatoFilme3 = sc.nextLine().strip().toLowerCase();

                //Adiciona a informação ao objeto
                legendadoOuDublado(formatoFilme3, ingresso);

                // Pausa interativa
                System.out.println("Pressione ENTER para escolher o tipo de ingresso...");
                sc.nextLine(); // espera ENTER

                //Escolhe o tipo do ingresso
                ingressos();
                tipoIngresso = sc.nextInt();

                //Aqui o usuário será o informado do valor do seu ingresso escolhido
                ingressoEscolhido(tipoIngresso, ingresso, sc);
                break;

            case 4:
                ingresso.setNomeFilme("Jesus, O REI");
                ingresso.setValor(35);

                //Informar se o filme é legendado ou dublado
                System.out.println("O filme vai ser legendado ou dublado? ");
                String formatoFilme4 = sc.nextLine().strip().toLowerCase();

                //Adiciona a informação ao objeto
                legendadoOuDublado(formatoFilme4, ingresso);

                // Pausa interativa
                System.out.println("Pressione ENTER para escolher o tipo de ingresso...");
                sc.nextLine(); // espera ENTER

                //Escolhe o tipo do ingresso
                ingressos();
                tipoIngresso = sc.nextInt();

                //Aqui o usuário será o informado do valor do seu ingresso escolhido
                ingressoEscolhido(tipoIngresso, ingresso, sc);
                break;


            case 0:
                System.out.println("Saindo...");
                break;
        }

    }

    private static void ingressoEscolhido(int tipoIngresso, Ingresso ingreso, Scanner sc) {
        IngressoFamilia ingressoFamilia;
        MeiaEntrada meiaEntrada;
        switch (tipoIngresso){
            case 1:
                meiaEntrada = new MeiaEntrada(ingreso);
                System.out.println("O seu ingresso ficou no valor: " + meiaEntrada.valorMeiaEntrada());

                break;

            case 2:
                System.out.println("O seu ingresso ficou no valor: " + ingreso.getValor());
                break;

            case 3:
                System.out.println("Quantidade de pessoas: ");
                int quantdPessoas = sc.nextInt();
                ingressoFamilia = new IngressoFamilia(ingreso);
                System.out.println("O valor dos ingressos ficou no valor: " + ingressoFamilia.valorIngressoFamilia(quantdPessoas));

                break;

            case 0:
                System.out.println("Saindo...");
                break;
        }
    }

    public static void legendadoOuDublado(String formatoEscolhido, Ingresso ingresso) {

        String formato = formatoEscolhido.trim();

        if (formato.equalsIgnoreCase("legendado")) {
            ingresso.setLegendado(true);
            System.out.println(ingresso.getLegendado());

        } else if (formato.equalsIgnoreCase("dublado")) {
            ingresso.setDublado(true);
            System.out.println(ingresso.getDublado());
        }

    }



    private static void ingressos() {
        String tipoIngresso = "Ingressos:\n" +
                "1-Meia-Entrada\n" +
                "2-Ingresso normal\n" +
                "3-Ingresso família\n" +
                "0-Desistir";
        System.out.println(tipoIngresso);
    }

    private static void catalogoFilmes() {
        String menu = "Seja bem vindo ao cinema!\n" +
                "Os seguintes filmes estão disponíveis: \n" +
                "1-Homem Aranha: De volta ao lar.\n" +
                "2-Velozes e furiosos\n" +
                "3-Vingadores\n" +
                "4-Jesus, O REI\n" +
                "0-Desistir";
        System.out.println(menu);
    }
}
