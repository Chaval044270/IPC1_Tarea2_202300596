/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ipc1_tarea2_202300596;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class IPC1_Tarea2_202300596 {

    public static void main(String[] args) {
        int opcion;
        double num1, num2, resultado;
        Scanner scan = new Scanner (System.in);
        System.out.println("Bienvenido a la calculadora aritmetica");
        System.out.println("Ingresa el numero del tipo de operacion deseas realizar:\n");
        System.out.println("1. Suma \t\t2. Resta\n3. Multiplicacion \t4. Division\n");
        opcion = scan.nextInt();
        System.out.println("Ingrese los dos numeros que desea operar\n");
        num1 = scan.nextInt(); num2 = scan.nextInt();
        switch (opcion) {
            case 1:
                resultado = num1+num2;
                System.out.println("Esta es la suma de ambos numeros: " + resultado);
                break;
            case 2:
                resultado = num1-num2;
                System.out.println("Esta es la resta de ambos numeros: " + resultado);
                break;
            case 3:
                resultado = num1*num2;
                System.out.println("Esta es la multiplicacion de ambos numeros: " + resultado);
                break;
            case 4:
                resultado = num1/num2;
                System.out.println("Esta es la division de ambos numeros: " + resultado);
                break;
        }
    }
}
