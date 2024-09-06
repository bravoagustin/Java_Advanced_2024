public class TipoVar {
    public static void main(String[] args) {
        System.out.println("**** Uso de var en java *******");

        //sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        //con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);

        //Definir otras variables usando...
        var edad = 30;
        System.out.println("edad = " + edad);

        var sueldo = 5000.5F;//se infiere el tipo float
        var esCasado = false; // se infiere tipo boolean
        esCasado = true;

        System.out.println("es casado? y su sueldo? = " + esCasado + " " + sueldo);

        //concatenado
        var nombre = "jesus";
        var nacionalidad = "argentino";
        var fraseCompleta = nombre + " " + "es" + " " + nacionalidad;
        System.out.println("fraseCompleta = " + fraseCompleta);


        }
    }
