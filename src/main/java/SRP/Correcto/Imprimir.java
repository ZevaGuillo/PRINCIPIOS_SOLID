package SRP.Correcto;

// cambiamos la responsabilidad de la presentación fuera de la clase de libros
public interface Imprimir {
    void imprimirLibro();
}

class imprimirXML implements Imprimir{

    @Override
    public void imprimirLibro() {
        System.out.println("imprimir xml");
    }
}

class imprimirHTML implements Imprimir{

    @Override
    public void imprimirLibro() {
        System.out.println("imprimir HTML");
    }
}

