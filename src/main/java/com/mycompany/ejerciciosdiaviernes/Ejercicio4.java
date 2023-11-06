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
public class Ejercicio4 {

    public static void main(String[] args) {
        int n, m, p;
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n = tc.nextInt();
        System.out.println("ingrese el segundo numero");
        m = tc.nextInt();
        System.out.println("ingrese el tercer numero");
        p = tc.nextInt();
        if (n > m && n > p && m > p) {
            System.out.println("el ordenamiento es:" + n + "," + m + "," + p);
        } else if (m > n && m > p && n > p) {
            System.out.println("el ordenamiento es:" + m + "," + n + "," + p);
        } else if (p > m && p > n && m > n) {
            System.out.println("el ordenamiento es:" + p + "," + m + "," + n);
        } else if (m > n && m > p && p > n) {
            System.out.println("el ordenamiento es:" + m + "," + p + "," + n);
        } else if (p > m && p > n && n > m) {
            System.out.println("el ordenamiento es:" + p + "," + n + "," + m);
        } else if (n > m && n > p && p > m) {
            System.out.println("el ordenamiento es:" + n + "," + p + "," + m);
        }
    }
}
