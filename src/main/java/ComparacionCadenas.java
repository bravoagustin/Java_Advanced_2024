public class ComparacionCadenas {
    public static void main(String[] args) {
        //comparacion de cadenas, pool de cadenas
        var cadena1 = "JAVA";
        var cadena2 = "JAVA";
        var cadena3 = new String("JAVA");

        //COMPARACION DE CADENAS == comparan la referencia
        System.out.print("cadena1 es igual a la referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        
        //comparamos cadena 1 con candena 3 referencias
        System.out.print("cadena 1 es igual a cadena 3? : ");
        System.out.println(cadena1 == cadena3);

        //equals comparar contenido
        System.out.print("cadena 1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
