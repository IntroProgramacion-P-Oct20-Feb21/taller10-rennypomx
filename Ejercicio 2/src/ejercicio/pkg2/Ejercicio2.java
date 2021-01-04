/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int[][] ventas = new int[2][5];
        int suma = 0;
        int valor;
        String cadenaFinal = "";
        for (int fila = 0; fila < ventas.length; fila++){
            
            System.out.printf("Ingresar valor de ventas diarias de %s:\n",
                    vendedores[fila]);
            for (int columna = 0; columna < ventas[fila].length; columna++){
                
                System.out.printf("Ventas Día %d:\n",
                        (columna + 1));
                valor = entrada.nextInt();
                ventas[fila][columna] = valor;
                suma = suma + ventas[fila][columna];
            }       
        }
        for (int fila = 0; fila < ventas.length; fila++){
            cadenaFinal = String.format("%sVendedor(a) %s\n",
                    cadenaFinal,
                    vendedores[fila]);
        }
        cadenaFinal = String.format("%sHa realizado un total de %d en "
                + "ventas.\n",
                cadenaFinal,
                suma);
        System.out.printf("%s", cadenaFinal);
    }

}