package ISP.Correcto;

public class Documento {
    private String titulo;
    private String extension;
}

interface Imprimir {
    void imprimir(Documento doc);
}

interface Escaner {
    void escanear(Documento doc);
}

class impresoraAntigua implements Imprimir{

    @Override
    public void imprimir(Documento doc) {
        // imprimiendo...
    }
}

class impresoraMultifuncional implements Imprimir, Escaner{

    @Override
    public void imprimir(Documento doc) {
        // imprimiendo...
    }

    @Override
    public void escanear(Documento doc) {
        // Escaneando...
    }
}