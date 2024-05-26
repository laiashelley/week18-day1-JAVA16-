// 1- PRINTAR CARACTERES LETRAS MINUSCULAS

// Mediante un bucle de que recorre tipos char, imprime todas las letras minúsculas de la 'a' a la 'z'.

// +EXTRA: imprimir las mayúsculas y las minúsculas sin los signos entre medio.


public class Java16ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        char letrasMinusculas = 'a';
        int letrasMinusculasNum = letrasMinusculas;
        letrasMinusculas = (char) (letrasMinusculasNum);

        for (int i=97; i<=122; i++){
            letrasMinusculas = (char) (letrasMinusculasNum);
            System.out.println(letrasMinusculas);
            letrasMinusculasNum++;
        }

        System.out.println("*****************************");

        char letrasMayusculas = 'A';
        int letrasMayusculasNum = letrasMayusculas;
        letrasMayusculas = (char) (letrasMayusculasNum);

        for (int i=65; i<=90; i++){
            letrasMayusculas = (char) (letrasMayusculasNum);
            System.out.println(letrasMayusculas);
            letrasMayusculasNum++;
        }

    }
}
