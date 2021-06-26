package SRP.Incorrecto;

public class Libro {
    private String autor;
    private String nombre;
    private int paginas;


    public void imprimirLibro(){
        System.out.println("Libro--");
    }

    //Al lector no le importa la ubicación del libro
    public void getLocation(){
        System.out.println("Retorna la ubicación del libro");
    }
}

