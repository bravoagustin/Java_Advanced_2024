public class GeneradorDeEmail {
    public static void main(String[] args) {
        var name = "Ubaldo Acosta Soto";
        var empresa = "Global Mentoring";
        var dominio = "com.mx";

        System.out.println("***Generador de Email*** \nNombre de usuario" + name +
                "\nNombre de usuario normalizado" +   name.split(" ")[0].toLowerCase() + "."
                + name.split(" ")[1].toLowerCase() + "." + name.split(" ")[2].toLowerCase()
                + "\nNombre de empresa:" + " " + empresa + "Nombre de dominio:" + " " + dominio
                + "\nNombre de email normalizado:" + " " + "@" + empresa.toLowerCase().replace(" ", "") + "." + dominio
        );

        System.out.println("\nEmail Generado con exito...");

        System.out.println(
                name.split(" ")[0].toLowerCase() + "." + name.split(" ")[1].toLowerCase() + "." + name.split(" ")[2].toLowerCase() +
                "@" + empresa.toLowerCase().replace(" ", "") + "." + dominio
        );
    }
}
