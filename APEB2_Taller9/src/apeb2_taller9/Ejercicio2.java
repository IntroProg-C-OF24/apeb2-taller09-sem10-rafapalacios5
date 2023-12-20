/*
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética 
y cuantos están por debajo de la medía aritmética.
 */
package apeb2_taller9;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int numeros= 13,arribaMedia=0, debajoMedia=0, sumatoria=0 ;
        double media;
        for (int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
            System.out.printf("%s, " ,arreglo[i]);
        }
        media=sumatoria/numeros;
        System.out.printf("\nLa media es " + media);
        arribaMedia=arreglo[0];
        debajoMedia=arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>media){
                arribaMedia=arreglo[i];
                System.out.printf("\nLos números por arriba de la media son: " + arribaMedia);
            }else{
                if (arreglo[i]<media){
                    debajoMedia=arreglo[i];
                    System.out.printf("\nLos números por debajo de la media son: " + debajoMedia);
                }
            }
        
        }       
    }
    
}
