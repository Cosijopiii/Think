/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cosijopii
 */
public class TestTraductor {
//esto es puro juego no le agas caso al arreglo "LOL"
    public static String lol[] = {"Creando el universo", "Bebiendo soda", "Volando", ".", "..", "....", ".......", "Creo que terminamos"};

    public static void main(String[] args) {

        Alfabeto a = new Alfabeto(Alfabeto.ALFABETO_BASICO);
        Alfabeto b = new Alfabeto(Alfabeto.ALFABETO_SECRETO);
        int opc;

        Scanner x = new Scanner(System.in);
        do {
            System.out.println("***************************************************************");
            System.out.println("Escoje el alfabeto");
            System.out.println("1.- Alfabeto normal");
            System.out.println("2.- Alfabeto Secreto");
            System.out.println("3.- Salir");

            opc = x.nextInt();
            if (opc == 1) {
                System.out.println("Este es el alfabeto que escogio ");
                for (int i = 0; i < Alfabeto.ALFABETO_BASICO.length; i++) {
                    System.out.println(Alfabeto.ALFABETO_BASICO[i]);
                }
                System.out.println("por favor introdusca la frase o palbra a traducir");
                String palabrausuario = x.next();
                System.out.println("Traduciendo........");
                a.palabra = palabrausuario.toUpperCase();

                for (int i = 0; i < lol.length; i++) {
                    try {

                        Thread.sleep(1000);
                        System.out.println(lol[i]);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestTraductor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                String traduccion = a.Traducir(a, b);
                System.out.println("*********************************************************");
                System.out.println("La palabra traducida al otro lenguaje es: " + traduccion);

                System.out.println("**********************************************************");
            }
            if (opc == 2) {

                System.out.println("Este es el alfabeto que escogio");
                for (int i = 0; i < Alfabeto.ALFABETO_SECRETO.length; i++) {
                    System.out.println(Alfabeto.ALFABETO_SECRETO[i]);
                }
                System.out.println("por favor introdusca la frase o palbra a traducir");
                String palabrausuario = x.next();
                System.out.println("Traduciendo........");
                b.palabra = palabrausuario.toUpperCase();
                for (int i = 0; i < lol.length; i++) {
                    try {

                        Thread.sleep(1000);
                        System.out.println(lol[i]);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestTraductor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String traduccion = a.Traducir(b, a);
                System.out.println("*********************************************************");
                System.out.println("La palabra traducida al otro lenguaje es: " + traduccion);

                System.out.println("**********************************************************");

            }
        } while (opc != 3);

    }

}
