/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

/**
 *
 * @author HOLA
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                          {"Carrie Burton", "Lauren Rice"},
                          {"Emma Escobar", "Lori Flores"},
                          {"Steven West", "Toni Martin"}  };
        String nombre;
        char inicial;
        String cadena = "";
        for (String[] estudiante : estudiantes) {
     for (String estudiante1 : estudiante) {
         nombre = estudiante1;
         inicial = nombre.charAt(0);
         switch (inicial) {
             case 'S':
             case 'P':
             case 'T':
                 cadena = String.format("%s%s\n", cadena, estudiante1);
                 break;
            }
          }
        }
        System.out.printf("%s", cadena);
    }
}

