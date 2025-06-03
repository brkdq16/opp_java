public class App {
    public static void main(String[] args) throws Exception {

        // Crear 3 libros usando diferentes contructores
        Libro libro1 = new Libro("El Mundo de Sofia", "Jostein Gaarder", 648, 50.00);
        Libro libro2 = new Libro("El Progreso del Peregrino", "John Bunyan", 444);
        Libro libro3 = new Libro("El Arte de la Prudencia", "Baltasar Gracián");

        // Aplicar un 10% de descuento a libro1
        libro1.setPrecio(10, true);

        // Cambiar el precio directamente a libro2
        libro2.setPrecio(15.99);

        // Aplicar descuento de 5 unidades monetarias a libro3
        libro3.setPrecio(5, false); // descuento directo

        // Mostrar información completa de todos
        System.out.println("\n--- Informacion Completa ---");
        System.out.println("\n--- Libro 1 ---");
        libro1.mostrarInfo();
        System.out.println("\n--- Libro 2 ---");
        libro2.mostrarInfo();
        System.out.println("\n--- Libro 3 ---");
        libro3.mostrarInfo();

        // Mostrar información resumida
        System.out.println("\n--- Información Resumida ---");
        System.out.println("\n--- Libro 1 ---");
        libro1.mostrarInfo(true);
        System.out.println("\n--- Libro 2 ---");
        libro2.mostrarInfo(true);
        System.out.println("\n--- Libro 3 ---");
        libro3.mostrarInfo(true);

    }
}
