public class InmutabilidadDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "hola";
        System.out.println("cadena1 = " + cadena1);
        cadena1 = "chau";
        var cadena2 = cadena1;
        System.out.println("cadena2 = " + cadena2);
    }
}
