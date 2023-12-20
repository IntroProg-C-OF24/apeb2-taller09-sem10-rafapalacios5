/*
Promedio Regular son todas las notas >=0 y <=5.9
Promedio Bueno son todas las notas >=6 y <=8.9
Promedio Sobresaliente son todas las notas >=9 y <=10
 */
package apeb2_taller9;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promediosCualitativos.length; i++) {
            if (promedios[i] <=10 && promedios[i] >= 9) 
                promediosCualitativos[i] = "Estudiante Sobresaliente";
            else 
                if (promedios[i] <=8.9 && promedios[i] >= 6) 
                    promediosCualitativos[i] = "Estudiante Bueno";
                else
                    if (promedios[i] <=5.9 && promedios[i] >= 0) 
                        promediosCualitativos[i] = "Estudiante regular";
            System.out.printf("%s promedio: %.2f  promedio cualitativo: %s \n", estudiantes[i], promedios[i], promediosCualitativos[i]);
        }
    }      
}
    

