/*
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con alguna de las primeras letras de los nombres del arreglo estudiantes.
 */
package apeb2_taller9;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (int i = 0; i < estudiantes.length; i++){ 
                if (estudiantes[i].startsWith(inicial)){
                    System.out.println("La letra ingresada no es correcta");
                    bandera=false;
                break;
                }
            } 
        }
    }
}
  
