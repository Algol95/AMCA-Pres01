/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acma.pres01;

/**
 *
 * @author Ángel Miguel Cubino Aragón
 */

/*Importación del escaner*/
import java.util.Scanner;
public class ACMAPres01 {

    public static void main(String[] args) {
        
        /*Inicio de Scanner*/
        Scanner teclado= new Scanner(System.in);
        /*VARIABLES*/
        int edad;
        int numero;
        int mes;
        int producto;
        int factorial = 1;
        
        // EJERCICIO 1
        /*Preguntar e introducir variable edad por pantalla*/
        System.out.println ("PRIMER PROGRAMA: Indicar Mayoría de Edad");
        System.out.println ("Introduzca su edad: ");
        edad = teclado.nextInt();
        /*Comienza la estructura de control de edad*/
        if (edad >= 18){
            System.out.println ("Tienes " + edad + " años. Eres mayor de edad.");
        }
        else{
            System.out.println("Tienes " + edad + " años. Eres menor de edad.");
        }
        /*NOTA: He tenido que cerrar el if y el else con llaves para que la
        continuación del programa no entrase dentro del else*/
        
        //EJERCICIO 2
        /*Preguntar e introducir variable número por pantalla*/
        System.out.println ("SEGUNDO PROGRAMA: Indicar si un número es par.");
        System.out.println ("Introduzca numero: ");
        numero = teclado.nextInt();
        
        /*Comienza la estructura de control de número par*/
        if (numero%2==0) {
            System.out.println("El número " + numero + " es par.");
        }
        else {
            System.out.println("El número " + numero + " es impar.");
        }
       
        //EJERCICIO 3.
        /*Preguntar e introducir variable mes por pantalla*/
        System.out.println ("TERCER PROGRAMA: Indicar los días del mes.");
        System.out.println ("Introduzca su mes (número): ");
        mes = teclado.nextInt();
        
        /*Comienza la estructura de control de días del año*/
        switch (mes){
            case 1:
             System.out.println ("El mes tiene 31 días");
             break;
            case 3:
             System.out.println ("El mes tiene 31 días");
             break;
            case 5:
             System.out.println ("El mes tiene 31 días");
             break;
            case 7:
             System.out.println ("El mes tiene 31 días");
             break;
            case 8:
             System.out.println ("El mes tiene 31 días");
             break;
            case 10:
             System.out.println ("El mes tiene 31 días");
             break;
            case 12:
             System.out.println ("El mes tiene 31 días");
             break;
            case 2:
             System.out.println ("El mes tiene 28 días.");
             break;
            case 4:
             System.out.println ("El mes tiene 30 días");
             break;
            case 6:
             System.out.println ("El mes tiene 30 días");
             break;
            case 9:
             System.out.println ("El mes tiene 30 días");
             break;
            case 11:
             System.out.println ("El mes tiene 30 días");
             break;
            default:
             System.out.println ("Se debe introducir un mes comprendido entre"
             + " 1 y 12");
        }
        
        //EJERCICIO 4.
        /*Preguntar e introducir variable factorial por pantalla*/
        System.out.println ("CUARTO PROGRAMA: Calculo de factorial.");
        System.out.println ("Introduzca el número: ");
        producto = teclado.nextInt();
        
        /*Comienza la estructura de control de calculo de factorial*/
        while (producto!=0) {
            factorial=factorial*producto;
            producto--;
        }
        System.out.println("El factorial es " + factorial);
    }
    
}
