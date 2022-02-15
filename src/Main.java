import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Se crea el metodo main donde se ejecutara el programa
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /**
         *Diseño para interactuar desde la consola
         */

        int Nave;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Presiona 0 para terminar");

        /**
         * Se crea el bucle Do-While para que el programa se ejecute
         * Hasta que se cumpla cierta condicion
         */

        do {
            System.out.println("Ingresa un numero de nave");
            Nave = Integer.parseInt(reader.readLine());

            /**
             * Respectivo switch para evaluar cada caso y que la consola nos de la nave que se quiere.
             */

            switch (Nave) {

                case 1:
                    Nave = 1;
                    System.out.println("Elegiste Mercury");
                break;

                case 2:
                    Nave = 2;
                    System.out.println("Elegiste Soho");
                break;

                case 3:
                    Nave = 3;
                    System.out.println("Elegiste Surveyor");
                break;

                case 4:
                    Nave = 4;
                    System.out.println("Elegiste Spaceshuttle");
                break;

                case 5:
                    Nave = 5;
                    System.out.println("Elegiste Falcon IX");
                break;

                case 6:
                    Nave = 6;
                    System.out.println("Elegiste Mariner X");
                break;

                case 7:
                    Nave = 7;
                    System.out.println("Elegiste Dragon V2");
                break;

                default:
                    System.out.println("No existe nave con esta denominacion");
                break;

            }
        } while(Nave != 0);
    }
}













