/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preevaluacion1;

import java.util.Scanner;

/**
 *
 * @author Catalina Muñoz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("CALCULADORA PARA NOTA EXAMEN");
        System.out.println("=============================");

        //crea variable escaner para poder pedirle al suario que escriba una respuesta x consola
        Scanner input = new Scanner (System.in);
        
        //Escribir para que el usuario ingrese nota 1
        System.out.println("ingresar nota 1");
        //creamos una variable tipo float(dicimal) para que guarde la respuesta x consola
        float n1 = input.nextFloat();
        //imprimimos por pantalla o consola el valor que el usuario escribió
        System.out.println("La nota 1 es = " + n1);

        System.out.println("Ingrese nota 2");
        float n2 =input.nextFloat();
        System.out.println("la nota 2 es = " + n2);

        System.out.println("Ingrese nota 3");
        float n3 =input.nextFloat();
        System.out.println("la nota 3 es = " + n3);

        //creamos una variable float para guardar el resultado del 
        //calculo del promedio
        float promedio = (n1+n2+n3)/3;

        //imprimimos el valor del promedio
        System.out.println("el promedio antes del examen es = "+ promedio);

        if(promedio >= 5.5){
            System.out.println("El alumno no da examen, aprueba");
        }else{
            System.out.println("el alumno se va a examen");
            float examen = (float) ((4 -(promedio*0.7))/0.3);
            System.out.println("la nota minima del examen tiene que ser: " +examen);
            if(examen > 7){
                System.out.println("el alumno reprueba, no se puede sacar una nota mayor a 7");
            }else{
                System.out.println("el alumno se tiene que sacar un "+examen+" para aprobar");
            }
        }
    } 
}
