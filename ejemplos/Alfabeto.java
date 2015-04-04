/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Cosijopii
 */
public class Alfabeto {

    //ASI SE INICIALIZA UN ARREGLO 

    public static final String ALFABETO_BASICO[] = {" ","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
        "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public static final String ALFABETO_SECRETO[]= {" ","3", "*", "X", "D", ".", "L", "9", "2", "1", "4", "K", ";", "/", "?", "¡", "!", "¿", "Ñ", "A",
        "#", "@", "J", "W", "Y", "Z", "7", "<"};

    String palabra;
    String alfabeto[] = new String[28];

    public Alfabeto() {
    }

    public Alfabeto(String alfabeto[]) {
        this.alfabeto = alfabeto;
    }

    public String Traducir(Alfabeto a, Alfabeto b) {
        StringBuilder traduccion=new StringBuilder();
        int temp;
        for (int i = 0; i <a.palabra.length(); i++) {
         
           temp=GetAlfabetoPosicion(a,a.palabra.charAt(i));
           traduccion.append(b.alfabeto[temp]); 
        }

        return traduccion.toString();
    }

    private int GetAlfabetoPosicion(Alfabeto a,char x) {
      
        for (int i = 0; i < a.alfabeto.length; i++) 
            if (a.alfabeto[i].equals(String.valueOf(x))) 
                return i;
        return 0;
        
    }

}
