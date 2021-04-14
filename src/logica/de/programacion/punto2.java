/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.de.programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t;
        t = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño del vector"));
        String[] nombres = new String[t];

        llenarVector(nombres);
        mostrar(nombres);
        encontrarNombre(nombres);
    }

    public static void llenarVector(String[] x) {
        for (int i = 0; i < x.length; i++) {
            String nombres = JOptionPane.showInputDialog(
                    "ingrese el nombre de una persona en el vector");
            x[i] = nombres;
        }
    }

    public static void mostrar(String[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("[" + x[i] + "]");
        }
    }

    public static void encontrarNombre(String[] x) {

        String nombre = JOptionPane.showInputDialog("ingrese el nombre a buscar  : ");
        int numRep = 0;
        for (int i = 0; i < x.length; i++) {

            if (nombre.equals(x[i])) {
                numRep++;
            }

        }

        System.out.println("\n" + "El nombre : " + nombre
                + " se repitio : " + numRep);
    }
}
