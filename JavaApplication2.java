/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese el valor de N: ");
    int N = entrada.nextInt();
    double SUMA=0;
    double X;
    double C=3;
    for (X=2;X<=N;X++)
    {
        SUMA=SUMA+X/C;
        C++;
    }
    System.out.println("La suma de la serie es = "+SUMA);
    }
    
}
