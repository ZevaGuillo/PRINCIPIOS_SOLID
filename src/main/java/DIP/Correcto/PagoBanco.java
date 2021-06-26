package DIP.Correcto;

public class PagoBanco implements ProcesarPago{

    private APIBanco apiBanco;

    public PagoBanco(APIBanco apiBanco) {
        this.apiBanco = apiBanco;
    }

    @Override
    public void pagar() {
        apiBanco.charge();
    }
}

