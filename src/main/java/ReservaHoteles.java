public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("***** Sistema de reserva de hoteles *****");

        //Definimos variables
        var nombreCliente = "Miguel Flores";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var vistaAlMar = true;

        //Detalle de reserva
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaAlMar = " + vistaAlMar);

        //Modificamos valores
        diasEstancia = 5;
        tarifaDiaria = 900.00;
        vistaAlMar = false;
        System.out.println();

        //Actualizamos.....
        System.out.println("Actualizamos...................");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaAlMar = " + vistaAlMar);

    }
}
