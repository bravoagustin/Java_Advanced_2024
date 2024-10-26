public class IndicesCadena {
    public static void main(String[] args) {
        //manejo de indicecs de una cadena
        var cadena = "Hola MUNDO";
        System.out.println(cadena);

        //recuperar el primer caracter
        char primerCaracter = cadena.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        //recuperar el ultimo caracter
        var ultimoCaracter = cadena.charAt(9);
        System.out.println("ultimo caracter = " + ultimoCaracter);

        //ejercicio
        var caracterEme = cadena.charAt(5);
        System.out.println("caracterQuinto = " + caracterEme);

    }
}
