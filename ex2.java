package com.mycompany.prova1;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumento = 1.5, salario = 1000, ano = 1996;

        do {
            salario = salario + (salario * aumento / 100);
            aumento = aumento * 2;
            ano++;

        } while (ano <= 2022);

        System.out.println(salario);
    }

}
