package logica.de.programacion;

import javax.swing.JOptionPane;

public class punto1 {

    public static void main(String[] args) {

        int[] codigos = new int[5];
        int[] litros = new int[5];

        llenarVectores(codigos, litros);
        System.out.println("la facturacion total es : " + facturacionTotal(litros));
        menosLitros(codigos, litros);
        masDe60(litros);

    }

    public static void llenarVectores(int[] x, int[] y) {

        for (int i = 0; i < 5; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo"
                    + " de la factura : " + i));
            y[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de litros"
                    + " de la factura con codigo : " + x[i]));

        }
    }

    public static int facturacionTotal(int[] y) {

        int contador = 0;
        int j = 0;
        int[] precio = new int[5];
        for (int i = 0; i < 5; i++) {
            y[i] *= 10000;
            precio[j] = y[i];
            j++;
        }

        int facturacion = 0;
        for (int i = 0; i < 5; i++) {
            facturacion = facturacion + precio[i];
        }
        return facturacion;
    }

    public static void menosLitros(int[] x, int[] y) {

        int menor = y[0];
        int posicion = 0;
        for (int i = 0; i < 5; i++) {
            if (y[i] < menor) {
                menor = y[i];
                posicion = i;
            }

        }
        System.out.println("la factura de codigo : " + x[posicion] + " Vendio "
                + "la menor cantidad de litros : " + menor);

    }

    public static void masDe60(int[] y) {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (y[i] > 60000) {
                contador++;
            }
        }
        int posicion = 0;
        int[] total = new int[contador];
        for (int i = 0; i < 5; i++) {
            if (y[i] > 60000) {
                total[posicion] = y[i];
                posicion++;
            }
        }
        System.out.println("Se emitieron " + contador + " facturas de mas de 60,000");
        System.out.println("las cuales son : ");
        for (int i = 0; i < total.length; i++) {
            System.out.print("[" + total[i] + "]" + " ");
        }
    }

}
