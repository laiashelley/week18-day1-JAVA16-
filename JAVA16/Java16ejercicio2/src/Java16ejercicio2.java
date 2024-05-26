
// 2- PRINTAR CARACTER SEGUN NUMERO

// Pides al usuario que escriba un número entre el 33 y el 126, y le muestras el carácter que le corresponde. Ejemplo:

// Numero de usuario: 65.  Muestras la A mayúscula.

import java.util.Scanner;

public class Java16ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int numeroUsuario;

        do{

            System.out.println("Escribe un número entre el 33 y el 126. Entra 0 para dejar de mostrar.");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario >= 33 && numeroUsuario <= 126){
                char caracterUsuario = (char) numeroUsuario;
                System.out.println("El caracter correspondiente a este numero es: " + caracterUsuario);
            } else {
                System.out.println("Por favor, introduce un valor entre el 33 y el 126 o bien sal de la actividad marcando 0.");
            }

        } while(numeroUsuario !=0);

    
        System.out.println("Gracias por participar!");
        

        sc.close();

    }
}
