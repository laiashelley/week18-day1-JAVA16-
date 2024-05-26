
// Cuando acabe que pregunte: ¿Actualizar resultados (S/N)? Si dice que sí, limpia el terminal y vuelve a preguntar los resultados. Si dice que no, limpia el terminal y escribe “hasta la próxima!” y se acaba el programa. Debe existir una clase Metodos, que contenga los métodos:

// - mostrarResultado()

// - limpiarPantalla() borra la consola,

// - aprietaEnter(). le dice “para seguir, aprieta enter”.

// Son en total tres clases: principal, Partido y Metodos.

import java.util.Scanner;

public class Metodos {
    
    public static void mostrarResultado(String nombre, double porcentaje) {
        System.out.println();
        System.out.print(nombre + " ");
        for (int i = 0; i < porcentaje; i++) {
            System.out.print("#");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void aprietaEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\naprieta ENTER para continuar");
        sc.nextLine();
    }



}
