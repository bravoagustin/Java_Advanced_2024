import java.util.Scanner;

public class LeerTiposCadenas {
    public static void main(String[] args) {
        //leer distintos tipos de datos
        //leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //double
        System.out.print("ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura =" + altura);
    }
}
