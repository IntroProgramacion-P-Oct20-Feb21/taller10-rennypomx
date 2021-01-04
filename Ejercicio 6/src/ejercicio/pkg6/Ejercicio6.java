/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

/**
 *
 * @author HOLA
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena = "";
        int numeroLetras;
        for (String[] estudiante : estudiantes) {
      for (String estudiante1 : estudiante) {
          numeroLetras = estudiante1.length();
          if (numeroLetras == 11) {
              cadena = String.format("%s%s\n", cadena, estudiante1);
          }
      }
        }
        System.out.printf("%s", cadena);
    }
}