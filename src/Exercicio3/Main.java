package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Relogio horas = new Relogio(23,35,20);
        RelogioAmericano horaAmericana =  new RelogioAmericano(horas);
        RelogioBrasileiro horaBrasileira = new RelogioBrasileiro(horas);

        System.out.println(horas.formatarHora());
        System.out.println("================================");
        System.out.println(horaAmericana.formatarHoraAmericana());
        System.out.println("================================");
        System.out.println(horaBrasileira.formatarHoraBrasileira());
    }
}
