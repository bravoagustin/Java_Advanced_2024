public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //subcadena
        var subcadena = cadena1.substring(0, 4);
        System.out.println("subcadena = " + subcadena);

        var subcadena2 = cadena1.substring(4);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
