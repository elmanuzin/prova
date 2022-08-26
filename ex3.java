package com.mycompany.prova1;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = 0, h, m, s;
        float massaInicial, massaFinal;
        System.out.println("Informe a massa inicial do material radiotivo (em gramas):");
         massaInicial = sc.nextFloat();
         
         massaFinal = massaInicial;
        
        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            tempo += 50;
        }

        System.out.println("Massa Inicial = " + massaInicial + " gramas.");
        System.out.println("Massa Final = " + massaFinal + " gramas.");
         h = (tempo / 3600);
         m = (tempo % 3600) / 60;
         s = (tempo % 3600) % 60;
        System.out.println(h + " horas: " + m + " minutos: " + s + " segundos.");
    }
}
