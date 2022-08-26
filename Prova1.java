package com.mycompany.prova1;

import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int maior, menor;

        System.out.println("Informe o número 1: ");
        n1 = sc.nextInt();

        maior = n1;
        menor = n1;

        System.out.println("Informe o número 2: ");
        n2 = sc.nextInt();

        if (n2 < menor) {
            menor = n2;
        }

        if (n2 > maior) {
            maior = n2;
        }

        System.out.println("Informe o número 3: ");
        n3 = sc.nextInt();

        if (n3 < menor) {
            menor = n3;
        }

        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("Informe o número 4: ");
        n4 = sc.nextInt();

        if (n4 < menor) {
            menor = n4;
        }
        
        if (n4 > maior) {
            maior = n4;
        }
        
        System.out.println("Informe o número 5 :");
        n5 = sc.nextInt();
        
        if (n5 < menor) {
            menor = n5;
        }
        
        if (n5 > maior) {
            maior = n5;
        }
        
        System.out.println("O maior número é o " + maior + " e o menor é o " + menor);

    }
}
