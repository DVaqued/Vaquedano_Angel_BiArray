/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_biarray;

import java.util.Scanner;

import java.util.Random;

public class Vaquedano_Angel_BiArray {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        //Variables para longitud y altura
        while (true) {
            int numRandom = 0;
            int numeroCantidad = 0;
            int filas = 0;
            int columnas = 0;
            int sumaDiagonal1 = 0;
            int sumDiagonal2 = 0;

            Random random = new Random();

            System.out.println("Ingrese la cantidad de filas y columnas que desea que se generen:");
            numeroCantidad = lea.nextInt();
            filas = numeroCantidad;
            columnas = numeroCantidad;
            if (numeroCantidad > 0) {
                int[][] arregloNumeros = new int[filas][columnas];
                System.out.println("El arreglo es: ");
                for (int Filas = 0; Filas < numeroCantidad; Filas++) {
                    for (int Columnas = 0; Columnas < numeroCantidad; Columnas++) {
                        numRandom = random.nextInt(10, 99);
                        arregloNumeros[Filas][Columnas] = numRandom;
                        System.out.print(arregloNumeros[Filas][Columnas] + " ");
                        if (Filas == Columnas) {
                            sumaDiagonal1 += numRandom;
                        }
                        if (Columnas + Filas == numeroCantidad - 1) {
                            sumDiagonal2 += numRandom;
                        }
                    }
                    System.out.println("");

                }
                System.out.println("\n");
                System.out.println("La suma total de la diagonal principal: " + sumaDiagonal1);
                System.out.println("La suma total de la diagonal secundario: " + sumDiagonal2);

                break;
            } else {
                System.out.println("Favor ingrese una cantidad valida.");
            }
        }
    }
}
