import java.util.Scanner;

public class ManejoConsola {

    public static void main(String[] args) {
        //introducir valores por consola

        var consola = new Scanner(System.in); // in - input - entrada de datos
        System.out.print("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("nombre = " + nombre);
    }
}

