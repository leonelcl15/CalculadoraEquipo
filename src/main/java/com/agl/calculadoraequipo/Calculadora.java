/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.calculadoraequipo;

/**
 *
 * @author vanes
 */
public class Calculadora {

    public static void main(String[] args) {
        System.out.println("=== Calculadora Básica ===");
        System.out.println("Versión 1.0");

        System.out.println("\nEjemplos de operaciones:");
        System.out.println("5 + 3 = " + sumar(5, 3));
        System.out.println("10 - 4 = " + restar(10, 4));
        System.out.println("6 * 4 = " + multiplicar(6, 4));
        System.out.println("20 / 5 = " + dividir(20, 5));
    }

    // Función para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Función para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Función para multiplicar dos números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Función para dividir dos números
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;
        }
    }
}

