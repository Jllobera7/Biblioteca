import java.util.ArrayList;
import java.util.Scanner;
public class Libro {

    //Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int copiasTotales;
    private int copiasDisponibles;

    private static int contador=0;

    //Constructores

    public Libro () {
    this.setCopiasDisponibles(0);
    this.setCopiasTotales(0);
    this.setContador();
    }

    public Libro (int isbn, String titulo, String autor, String editorial, int copiasTotales, int copiasDisponibles) {
    this.setIsbn(isbn);
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setEditorial(editorial);
    this.setCopiasDisponibles(copiasDisponibles);
    this.setCopiasTotales(copiasTotales);
    this.setContador();
    }

    public Libro(Libro libro){
        this.setIsbn(libro.getIsbn());
        this.setTitulo(libro.getTitulo());
        this.setAutor(libro.getAutor());
        this.setEditorial(libro.getEditorial());
        this.setCopiasDisponibles(libro.getCopiasDisponibles());
        this.setCopiasTotales(libro.getCopiasTotales());
        this.setContador();
    }
    //Métodos

    public String toString() {
        return "Libro [isbn=" + this.isbn + ", titulo=" + this.titulo + ", autor=" + this.autor + ", editorial=" + this.editorial
                + ", copiasTotales=" + this.copiasTotales + ", copiasDisponibles=" + this.copiasDisponibles + "]";
    }

    public void addLibro (ArrayList<Libro> lista) {
        Scanner teclado = new Scanner(System.in);
        Libro lib = new Libro();

        System.out.println("Introduzce ISBN: ");
        lib.setIsbn(teclado.nextInt());

        teclado.nextLine(); //vacío el buffer

        System.out.println("Introduzca titulo: ");
        lib.setTitulo(teclado.nextLine());

        System.out.println("Introduzca autor: ");
        lib.setAutor(teclado.nextLine());

        System.out.println("Introduzca editorial: ");
        lib.setEditorial(teclado.nextLine());

        System.out.println("Introduza copias totales: ");
        lib.setCopiasTotales(teclado.nextInt());

        teclado.nextLine();//vacío el buffer

        System.out.println("Introduzca copias disponibles: ");
        lib.setCopiasDisponibles(teclado.nextInt());

        teclado.nextLine();//vacío el buffer

        lista.add(lib);
    }

    //getters y setters

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopiasTotales() {
        return this.copiasTotales;
    }

    public void setCopiasTotales(int copiasTotales) {
        if (copiasTotales <= 1) {
            this.copiasTotales = 1;
        } else {
            this.copiasTotales = copiasTotales;
        }
    }
    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopiasDisponibles() {
        return this.copiasDisponibles;
    }


    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
        }

    public  int getContador() {
        return this.contador;
    }

    public void setContador() {
        this.contador = this.contador+1;
    }


}



