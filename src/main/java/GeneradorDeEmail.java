public class GeneradorDeEmail {
    public static void main(String[] args) {
        var nameComplete = "Ubaldo Acosta Soto";
       
        var dominio = "com.mx";

        System.out.println("***Emails Generator*** \n--- name complete:" + " " + nameComplete);

        //Procesar o normalizar el nombre de usuario
        //Limpiar espacios en blanco al inicio y al final
        var nameNormalizer = nameComplete.strip();

        //reemplazar los espacios en blanco al inicio y al final x un punto;
        nameNormalizer = nameNormalizer.replace(" ", ".");

        nameNormalizer = nameNormalizer.toLowerCase();
        System.out.println("--- nameNormalizer = " + nameNormalizer);

        var nameStartup = "Global Mentoring";
        System.out.println("--- nameStartup = " + nameStartup);
        
        var domain = ".com.mx";
        System.out.println("--- domain = " + domain);

        //Quitamos los espacios en blanco y convertimos a minusculas
        var nameStartupNomalizer = nameStartup.strip().replace(" ", ".").toLowerCase();
        var domainNormalizer = "@" + nameStartupNomalizer + domain;

        System.out.println("domainNormalizer = " + domainNormalizer);

        //Creamos el email final
        var emailNormalizer = nameNormalizer + domainNormalizer;
        System.out.println("emailNormalizer = " + emailNormalizer);

    }
}
