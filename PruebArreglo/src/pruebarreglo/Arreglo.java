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
}
