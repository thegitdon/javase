/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        byte l;
        byte r;

        //https://www.youtube.com/watch?v=nmhjrI-aW5okk
        System.out.println("Bubble Sort[]");
        byte[] b = new byte[4];
        b[0] = 1;
        b[1] = 6;
        b[2] = 2;
        b[3] = 5;

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (b[j] > b[j + 1]) {
                    r = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = r;

                }

            }

        }

        for (byte bS : b) {
            System.out.println(bS);
        }

        //
        System.out.print("[] ");
        l = Byte.parseByte(s.nextLine());

        String[] n = new String[l];

        for (int i = 0; i < n.length; i++) {
            System.out.print("[] " + i + " "); //n[i] = null, vacío{" ", " "}
            n[i] = s.nextLine();

        }

        //for (int i = 0; i < n.length; i++) {
        //  System.out.print(n[i] + " ");
        //}
        for (String names : n) {//tipo de arreglo, "apodo" [names, puntero a los elementos del vector], vector a recorrer
            System.out.println(names);
        }

        //Paralelos
        System.out.println("---");
        System.out.print("[] - > [] ");
        l = Byte.parseByte(s.nextLine());
        String[] v = new String[l];
        String[] v2 = new String[l];

        for (int i = 0; i < l; i++) {
            System.out.print("[v] " + i + " ");
            v[i] = s.nextLine();
            System.out.print("[vv] " + i + " ");
            v2[i] = s.nextLine();

        }

        for (int i = 0; i < l; i++) {
            System.out.println(v[i] + " -> " + v2[i]);

        }
    }

}
