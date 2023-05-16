package tablasumas;

import java.util.Scanner;

/**
 *
 * @author Jackson
 */
public class TablaSumas {

    public static void main(String[] args) {
        System.out.println("Tarea #2 - Construccion y evolucion de software");
        System.out.print("Ingrese un numero para realizar las sumas: ");
        Scanner ingresoDatos = new Scanner(System.in);
        int numero = 0;
        numero = Integer.parseInt(ingresoDatos.next());
        int resultado = 0;
        
        for(int i = 0; i < 12; i++){
            resultado = numero + i + 1;
            if(i < 9){
                System.out.println(numero + " + " + (i+1) + "  = " + resultado);
            } else {
                System.out.println(numero + " + " + (i+1) + " = " + resultado);
            }
        }
        
    }
    
}
