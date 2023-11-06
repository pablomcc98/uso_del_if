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
public class Ejercicio3 {

    public static void main(String[] args) {
        int n, m;
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n = tc.nextInt();
        System.out.println("ingrese el segundo numero");
        m = tc.nextInt();
        if (n > m) {
            System.out.println("los numeros en orden serian:  " + n + " y despues" + m);
        } else {
            System.out.println("los nuermoes ordenados serian:" + m + " y despues" + n);
        }
    }
}
