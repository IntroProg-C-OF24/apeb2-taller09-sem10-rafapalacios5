/*
Genera una aplicación que permita ingresar valores a un arreglo de cadenas. 
El arreglo almacena el número de elementos que el usuario lo disponga. 
Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras A, C, T.
 */
package apeb2_taller9;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int limMarca = 0 ;
        System.out.println("Ingrese la cantidd de marcas que desea");
        limMarca = teclado.nextInt();
        String[] marcaVehiculo = new String[limMarca];
       
        for (int i = 0; i < limMarca; i++) {
            System.out.println("Ingrese las marcas ");
            marcaVehiculo[i] = teclado.next();         
            if (marcaVehiculo[i].startsWith("A"))
                i--;
            else 
                if (marcaVehiculo[i].startsWith("C"))
                    i--;
                else 
                    if (marcaVehiculo[i].startsWith("T"))
                        i--;        
        }
        for (int i = 0; i < limMarca; i++) {
            System.out.printf(" Marca %d: %s \n" , (i+1), marcaVehiculo[i]);
        }
        
    }       
}

