/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author HOLA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10},
        {3, 7, 9}, {10, 9, 2.1}};
        double nota;
        String cadenaFinal = "";
        
        for (int fila = 0; fila < notasCualitativas.length; fila++) {
            for (int columna = 0; columna < notasCualitativas[fila].length;
                    columna++) {
                nota = notasCuantitativas[fila][columna];
                if ((nota >= 0) && (nota <= 2.9)) {
                    notasCualitativas[fila][columna] = "Insuficiente";
                } else {
                    if ((nota >= 3) && (nota <= 4.9)) {
                        notasCualitativas[fila][columna] = "Regular";
                    } else {
                        if ((nota >= 5) && (nota <= 7.9)) {
                            notasCualitativas[fila][columna] = "Buena";
                        } else {
                            if ((nota >= 8) && (nota <= 9.5)) {
                                notasCualitativas[fila][columna] = "Muy Buena";
                            } else {
                                if ((nota >= 9.6) && (nota <= 10)) {
                                    notasCualitativas[fila][columna] = 
                                            "Sobresaliente";
                                }
                            }
                        }
                    }
                }
                cadenaFinal = String.format("%s%.2f = %s\n",
                        cadenaFinal,
                        notasCuantitativas[fila][columna],
                        notasCualitativas[fila][columna]);
                }
            }
        System.out.printf("%s", cadenaFinal);
        } 
    }
