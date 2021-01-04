/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author HOLA
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenaFinal = "";
        double suma;
        double[][] valores = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] nombres = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedio = new double[3];
        for (int fila = 0; fila < nombres.length; fila++){
            suma = 0;
            for (int columna = 0; columna < valores[fila].length; columna++){
                suma = suma + valores[fila][columna];
            }
            promedio[fila] = suma / valores[fila].length;
        }
        for (int fila = 0; fila < nombres.length; fila++){
            cadenaFinal = String.format("%sEstudiante: %s tiene un promedio "
                    + "de %.2f\n",
                    cadenaFinal,
                    nombres[fila],
                    promedio[fila]);
        }
        System.out.printf("%s", cadenaFinal);
    }
    
}
        
        
    
    

