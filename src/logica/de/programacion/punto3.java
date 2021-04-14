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
public class punto3 {

    public static void main(String[] args) {

        int t, y;
        t = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del vector empleados"));
        String[] empleados = new String[t];
        int[] sueldos = new int[t];

        llenarVectores(empleados, sueldos);

        gananMas(empleados, sueldos);

        gananMenos(empleados, sueldos);

        menosGana(empleados, sueldos);
    }

    public static void llenarVectores(String[] x, int[] y) {
        String n = "";
        int m = 0;
        for (int i = 0; i < x.length; i++) {
            n = JOptionPane.showInputDialog("ingrese el nombre de un empleado");
            x[i] = n;
            m = Integer.parseInt(JOptionPane.showInputDialog("ingrese el salario del empleado : " + n));
            y[i] = m;

        }

    }

    public static void gananMas(String[] x, int[] y) {

        int promedio = 0;
        int suma = 0;
        for (int i = 0; i < y.length; i++) {
            suma += y[i];
        }
        promedio = suma / y.length;

        int cont = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] > promedio) {
                cont = i;
                System.out.println("El empleado : " + x[cont] + " Tiene un salario"
                        + " mayor o igual al promedio : " + y[i]);
            }
        }
    }

    public static void gananMenos(String[] x, int[] y) {
        int promedio = 0;
        int suma = 0;
        for (int i = 0; i < y.length; i++) {
            suma += y[i];
        }
        promedio = suma / y.length;

        int cont = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] < promedio) {
                cont = i;
                System.out.println("El empleado : " + x[cont] + " Tiene un salario menor"
                        + " al promeido : " + y[i]);
            }
        }
    }

    public static void menosGana(String[] x, int[] y) {
        int menosgana = y[0];
        int cont = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] < menosgana) {
                menosgana = y[i];
                cont = i;

            }
        }
        System.out.println("El empleado : " + x[cont] + " Tiene el salario"
                + " mas bajo de todos : " + (int) menosgana);
    }

}
