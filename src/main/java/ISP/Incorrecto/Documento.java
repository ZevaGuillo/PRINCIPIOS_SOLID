package ISP.Incorrecto;

public class Documento {
    private String titulo;
    private String extension;
}

interface Maquina{
    void imprimir(Documento doc);
    void escanear(Documento doc) ;
}

class impresoraAntigua implements Maquina{

    @Override
    public void imprimir(Documento doc) {
        // imprimiendo...
    }

    @Override
    public void escanear(Documento doc) {
        //throw new Exception("No se puede escanear");
    }
}

class impresoraMultifuncional implements Maquina{

    @Override
    public void imprimir(Documento doc) {
        // imprimiendo...
    }

    @Override
    public void escanear(Documento doc){
        // Escaneando...
    }
}

