package DIP.Incorrecto;

public class PCStore {
    private APIBanco apiBanco;

    public PCStore(APIBanco apiBanco) {
        this.apiBanco = apiBanco;
    }

    public void finalizarCompra(){
        apiBanco.charge();
    }
}

