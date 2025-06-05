public class ConcatenacionDeCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        //Metodo Concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);

        //StringBuilder new es nueva clase.
        var constructorCadenas = new StringBuilder();
//        constructorCadenas.append(cadena1);
//        constructorCadenas.append(" ");
//        constructorCadenas.append(cadena2);

        constructorCadenas.append(cadena1).append(" ").append(cadena2).toString();
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("resultado buffer= " + resultado);

        //join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado join = " + resultado);
    }
}
