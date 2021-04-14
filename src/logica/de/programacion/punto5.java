/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.de.programacion;

import javax.swing.JOptionPane;

public class punto5 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][7];
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ingrese la venta del "
                        + " dia " + i + " " + j));
                suma += matriz[i][j];
                contador++;
            }

        }
        double promedio = suma / contador;
        JOptionPane.showMessageDialog(null, "El promedio de ventas son : " + promedio);
        suma = 0;
        boolean band = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (promedio > 10000) {
                    if (i == 0) {
                        suma += matriz[i][j];
                    }
                } else {
                    if (i == 3) {
                        suma += matriz[i][j];
                        band = false;
                    }
                }
            }

        }
        if (band == true) {
            JOptionPane.showMessageDialog(null, "las ventas de la primera semana son : " + suma);
        } else {
            JOptionPane.showMessageDialog(null, "las ventas de la ultima semana son : " + suma);
        }

    }

}
