// 1. Creacion de la clase
public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;
    private double precio;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.precio = 0;
        this.precio = 0.0;
    }

    // 2. Constructores sobrecargados:

    // Constructor 1: Todos los atributos
    public Libro(String titulo, String autor, int paginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precio = precio;
    }

    // Constructor 2: Sin precio (usa 0.0 como valor predeterminado)
    public Libro(String titulo, String autor, int paginas) {
        this(titulo, autor, paginas, 0.0);
    }

    // Constructor 3: Solo título y autor
    public Libro(String titulo, String autor) {
        this(titulo, autor, 0, 0.0);
    }

    // 3. Métodos Sobrecargados:

    // setPrecio version 1: asigna nuevo precio
    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // setPrecio version 2: aplica descuento
    public void setPrecio(double descuento, boolean esPorcentaje) {
        if (esPorcentaje) {
            double montoDescuento = this.precio * descuento / 100;
            if (this.precio - montoDescuento >= 0) {
                this.precio -= montoDescuento;
            } else {
                System.out.println(
                        "Error: El descuento en porcentaje es demasiado alto y resultaria en un precio negativo");
            }

        } else {
            if (this.precio - descuento >= 0) {
                this.precio -= descuento;
            } else {
                System.out.println("Error: El descuento en monto es mayor que el  precio actual.");
            }
        }
    }

    // mostrarInfo version 1: muestra todo
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Precio: " + precio);
    }

    // mostrarInfo version 2: muestra solo si resumido == true
    public void mostrarInfo(boolean resumido) {
        if (resumido) {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
        } else {
            mostrarInfo(); // llama al otro metodo
        }
    }
}
