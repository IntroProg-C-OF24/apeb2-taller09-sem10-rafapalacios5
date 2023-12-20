/*
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, 
se solicita las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes 
para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 */
package apeb2_taller9;
public class Ejercicio5 {
    public static void main(String[] args) {
        int limEstu =28;
        double notasEst[]= new double [limEstu];
        double sumaNotas =0, promedio, notaMayor, notaMenor;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i]= (double)(Math.random()*(9-0+1)+0);   
        }
        System.out.println("Listado de notas:");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("%s %d: %.2f \n" ,"Nota del Est", (i+1), notasEst[i]);
        }
        for (int i = 0; i < notasEst.length; i++) {
            sumaNotas += notasEst[i];
        }
        notaMayor=notasEst[0];
        notaMenor=notasEst[0];
        for (int i = 1; i < notasEst.length; i++) {
            //notaMayor=(notasEst[i] > notaMayor)? notasEst[i]: notasEst[i-1];
            if (notasEst[i] > notaMayor)
                notaMayor = notasEst[i];
            if (notasEst[i] < notaMenor)
                notaMenor = notasEst[i];    
        }
        System.out.printf("Nota Mayor: %.2f \n" , notaMayor);
        System.out.printf("Nota Menor: %.2f \n" , notaMenor);
        promedio = sumaNotas /notasEst.length;
        System.out.printf("Promedio: %.2f \n" , promedio);
        for (int i = 0; i< notasEst.length; i++) {
            if (notasEst[i] > promedio)
               System.out.printf("Notas por encima del promedio %d: %.2f \n" , (i+1), notasEst[i]);
            if (notasEst[i] < promedio)
               System.out.printf("Notas por debajo del promedio %d: %.2f \n" , (i+1), notasEst[i]);
        }
    }    
}