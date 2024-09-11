package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el valor total de la cuenta (incluyendo IVA, en pesos): ");
        double valorCuenta = scanner.nextDouble();

       
        System.out.print("Ingrese el porcentaje de propina que desea dejar (por ejemplo, 12 para el 12%): ");
        double porcentajePropina = scanner.nextDouble();

        scanner.close();

        double porcentajeDecimal = porcentajePropina / 100.0;

       
        double valorPropina = valorCuenta * porcentajeDecimal;

      
        double valorTotal = valorCuenta + valorPropina;

       
        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + String.format("%.0f", porcentajePropina) + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));

    }
}