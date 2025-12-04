/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio012bim;

/**
 *
 * @author UTPL
 */
public class Ejercicio012BIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajeFinal = "";

        int bAcumulado = 0;
        int cAcumulado = 0;
        int dAcumulado = 0;
        int eAcumulado = 0;
        for (int a = 30; a >= 10; a--) {
            int b = a;
            int c = a * 2;
            int d = a * 3;
            int e = a * 4;
            bAcumulado = bAcumulado + b;
            cAcumulado = cAcumulado + c;
            dAcumulado = dAcumulado + d;
            eAcumulado = eAcumulado + e;
            mensajeFinal = String.format("%s%d - %d - %d - %d\n",
                    mensajeFinal, b, c, d, e);
        }
        mensajeFinal = String.format("%s%d - %d - %d - %d\n",
                    mensajeFinal, bAcumulado, cAcumulado, dAcumulado, eAcumulado);
        
        System.out.printf("%s\n", mensajeFinal);
    }
}
