/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double[][] datos = new double[2][2];
        double valor;
        String cadena = "";
        for (int fila = 0; fila < datos.length; fila++){
            for (int columna = 0; columna < datos[fila].length; columna++){
                System.out.println("Ingresar un valor numérico: ");
                valor = entrada.nextDouble();
                datos[fila][columna] = valor;
                cadena = String.format("%sPosición[%d][%d] = %.2f\n",
                        cadena,
                        fila,
                        columna,
                        datos[fila][columna]);
            }
        }
        System.out.printf("%s", cadena);
    }

}
