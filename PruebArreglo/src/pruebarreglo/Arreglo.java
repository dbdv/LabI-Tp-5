/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Arreglo {
    public static void sumarLista(int[] lista){
        
        int suma = 0;
        double promedio;
        
        for(int i= 0; i < lista.length; i++)
           suma += lista[i];
        
        int i = 0;
        while(i < lista.length){
            suma += lista[i++];
        }
        
        promedio = suma/lista.length;
        
        JOptionPane.showMessageDialog(null, "La suma de todos los elementos es " + suma + " y el promedio es " + promedio);
    }
    
    public static int buscarMayor(int[][] lista){
        int mayor = lista[0][0];
        
        for(int i = 0; i < lista.length; i++){
            for(int j = 0; j < lista[i].length; j++){
                if(mayor < lista[i][j]){
                    mayor = lista[i][j];
                }
            }
        }
        
        return mayor;
    }
    
    public static int cuentaVocales(String string){
        int cantVocales = 0;
        char[] vocales = {'a','e','i','o','u'};
        
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (string.charAt(i) == vocales[j]) {
                    cantVocales++;
                }
            }
        }

        return cantVocales;
    }
  
    public static int cuentaCaracter(String string, char carac) {
        int vecesCarac = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == carac) {
                vecesCarac++;
            }
        }

        return vecesCarac;
    }
}
