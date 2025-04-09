import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra = "mosquito";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabra.length()];


        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && (intentos < intentosMaximos)) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) +" " +palabra.length()+" Letras");
            System.out.println("Introduzca una letra: ");
            char letra = Character.toLowerCase(sc.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("letra incorrecta! Te quedan: "+ (intentosMaximos-intentos) + " intentos" );
            }


            if(String.valueOf(letrasAdivinadas).equals(palabra)){
                palabraAdivinada = true;
                System.out.println("Palabra adivinada!! Felicidades!");
            }
        }
        if(!palabraAdivinada){
            System.out.println("Palabra no adivinada! Te quedaste sin intentos.");
            System.out.println("la palabra era "+palabra);
        }
        sc.close();
    }
}
