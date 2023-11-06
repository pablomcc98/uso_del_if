package com.mycompany.ejerciciosdiaviernes;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("ingresa el dia");
        dia = tc.nextInt();
        System.out.println("ingresa el mes");
        mes = tc.nextInt();
        System.out.println("ingresa el año");
        anio = tc.nextInt();
        if (mes > 0 && mes <= 12) {
            switch (mes) {
                case 1:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("enero");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 2:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("febrero");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 3:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("marzo");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 4:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("abril");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 5:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("mayo");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 6:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("junio");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 7:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("julio");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 8:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("agosto");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 9:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("septiembre");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 10:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("octubre");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 11:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("noviembre");
                        System.out.println("estamos en el dia" + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
                case 12:
                    if (dia > 0 && dia <= 31) {
                        System.out.println("diciembre");
                        System.out.println("estamos en el dia: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("el dia ingresado es erroneo");
                    }
                    break;
            }
        } else {
            System.out.println("el mes ingresado es incorrecto");
        }
    }
}
