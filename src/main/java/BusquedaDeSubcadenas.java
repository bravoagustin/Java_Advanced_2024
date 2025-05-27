public class BusquedaDeSubcadenas {
    //Buscar Subcadenas
    //indexOf - Devuelve el indice de la primera aparicion de la subcadena
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        //subcadena buscar hola

        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //LastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de Mundo

        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var indice3 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
    }

}
