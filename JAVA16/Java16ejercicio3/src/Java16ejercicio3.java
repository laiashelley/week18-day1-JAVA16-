// 2- BARRAS RESULTADOS ELECTORALES

// Son las elecciones! Se van a mostrar gráficamente los resultados de cada partido. OK

// Crea una clase Partido con los datos: nombre y porcentaje. Instancia al menos 5 partidos. OK

// Pedir el porcentaje de votos recibido para cada uno de los partidos. Impide que se escriba un tipo diferente mediante hasNext() (ej: si se pide un entero, usar teclado.hasNextInt() )

// Cuando estén introducidos todos los resultados, crear un método que muestre barras de resultado para cada uno de los participantes. Puedes escoger cualquier carácter alfanumérico habitual, como *, o #.

// Cuando acabe que pregunte: ¿Actualizar resultados (S/N)? Si dice que sí, limpia el terminal y vuelve a preguntar los resultados. Si dice que no, limpia el terminal y escribe “hasta la próxima!” y se acaba el programa. Debe existir una clase Metodos, que contenga los métodos:

// - mostrarResultado()

// - limpiarPantalla() borra la consola,

// - aprietaEnter(). le dice “para seguir, aprieta enter”.

// Son en total tres clases: principal, Partido y Metodos.

// +EXTRA se pueden añadir controles del tipo: suma la cantidad más del 100% ?

// +EXTRA: como controlarías may/min en S/N con tipo char

// NOTA: el extended ASCII list (número ascii más de 127) puede dar error, o mostrar resultados diferentes según el sistema operativo o charset empleado.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java16ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        char salir = 's';
        Scanner sc = new Scanner(System.in);
        double porcentaje = 0;

        do{
            Metodos.limpiarPantalla();
            System.out.println("Las elecciones:");
            Partidos partido1 = new Partidos("PSOE", 0);
            Partidos partido2 = new Partidos("ERC", 0);
            Partidos partido3 = new Partidos("Podemos", 0);
            Partidos partido4 = new Partidos("PACMA", 0);
            Partidos partido5 = new Partidos("partidoComunista", 0);

            ArrayList<Partidos> partidos = new ArrayList<>(Arrays.asList(partido1, partido2, partido3, partido4, partido5));

            for (int i = 0; i < partidos.size(); i++){
                System.out.println("¿Cuánto porcentaje ha obtenido el partido " + partidos.get(i).getNombrePartido() + ":");

                while (!sc.hasNextInt()){
                    sc.nextLine();
                    System.out.println("Debes escribir un numero y ya está.");
                }

                porcentaje = sc.nextInt();
                partidos.get(i).setPorcentaje(porcentaje);

            }

            for (int i = 0; i < partidos.size(); i++) {
                Metodos.mostrarResultado(partidos.get(i).getNombrePartido(),
                        partidos.get(i).getPorcentaje());
            }

            Metodos.aprietaEnter();
            System.out.println("Quieres continuar? Puedes poner 's' para salir");
            salir = sc.next().charAt(0);
            salir = Character.toLowerCase(salir);


        } while (salir != 's');

        Metodos.limpiarPantalla();
        System.out.println("Hasta la próxima!");
        sc.close();

    }
}


