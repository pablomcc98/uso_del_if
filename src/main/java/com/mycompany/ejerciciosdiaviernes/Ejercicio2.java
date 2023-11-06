/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosdiaviernes;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int n;
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        n = tc.nextInt();
        if (n > 0) {
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es negativo");
        }
    }
}
