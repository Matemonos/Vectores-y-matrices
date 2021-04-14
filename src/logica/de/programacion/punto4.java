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
public class punto4 {

    public static void main(String[] args) {
        int t, c;
        
        int multiplicacion = 1;
        
        int suma = 0;
        
        t = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de las "
                + "filas de la matriz"));
        
        c = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de las "
                + "columnas de la matriz"));
        
        int[][] matriz = new int[t][c];
        String salida = "";
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero en la matriz"
                        + " en la posicion " + "[" + i + "]" + "[" + j + "]"));
                salida += matriz[i][j] + "  ";
                
            }
            salida += "\n";
        }
          JOptionPane.showMessageDialog(null,salida);
        
          
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                
                if (matriz[i][j] > 0) {
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("la suma de los positivos es : " + suma);
          
           
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < 0) {
                    multiplicacion = multiplicacion * matriz[i][j];
                }
            }
        }
          System.out.println("la multiplicacion de los negativos es : " + multiplicacion);
        
    }
}

          
          
          /*ESTO DE ABAJO SON METODOS. SE PUEDEN UTILIZAR SI SE DESCOMENTAN
          
          
//        /*llenarMatriz(matriz);
//        System.out.println("la suma de los positivos es : " + sumaPositivos(matriz));
//        System.out.println("la multiplicacion de los negativos es : " + multiNegativos(matriz));
//
//    }
//
//    public static void llenarMatriz(int[][] x) {
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[0].length; j++) {
//                int llena = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero en la matriz"
//                        + " en la posicion " + "[" + i + "]" + "[" + j + "]"));
//            }
//        }
//
//    }
//
//    public static int sumaPositivos(int[][] x) {
//        int suma = 0;
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[0].length; j++) {
//                if (x[i][j] > 0) {
//                    suma += x[i][j];
//                }
//            }
//        }
//        return suma;
//    }
//
//    public static int multiNegativos(int[][] x) {
//        int multiplicacion = 0;
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[0].length; j++) {
//                if (x[i][j] < 0) {
//                    multiplicacion *= x[i][j];
//                }
//            }
//        }
//        return multiplicacion;
//    }

}*/
