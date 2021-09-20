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
public class PruebArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arregloIrregularEnteros = {{40,61,74},{100},{54,82,93,24,17,84,83}};
        String string = "Cuantas vocales tiene esta frase preparada";
        
        JOptionPane.showMessageDialog(null, 
                "El mayor numero del arreglo es: "+Arreglo.buscarMayor(arregloIrregularEnteros)+"\nLa frase #"+string+"# tiene "+Arreglo.cuentaVocales(string)+" vocales.\n"
                        + "La frase anterior repite la s "+Arreglo.cuentaCaracter(string, 's')+" veces");
    }
    
}
