public class TiendaEnLinea {
    public static void main(String[] args) {

        String nombreProducto = "Coca cola";
        double precioProducto = 156.5;
        int cantidadDisponible = 2;
        boolean disponibleVenta = false;

        System.out.println("disponibleVenta = " + disponibleVenta);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("precioProducto = $" + precioProducto);
        System.out.println("nombreProducto = " + nombreProducto);

        System.out.println("************************************** valores actualizados **************************************");

         nombreProducto = "Coco";
         precioProducto = 157.5;
         cantidadDisponible = 1;
         disponibleVenta = true;

        System.out.println("disponibleVenta = " + disponibleVenta);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("precioProducto = $" + precioProducto);
        System.out.println("nombreProducto = " + nombreProducto);

    }
}
