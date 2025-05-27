public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena original = " + cadena);

        //Reemplazar "mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //reemplazar Hola por adios
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena2 = " + nuevaCadena);
    }
}
