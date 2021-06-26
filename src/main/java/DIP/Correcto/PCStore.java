package DIP.Correcto;


public class PCStore {

    private ProcesarPago tipoPago;

    public PCStore(ProcesarPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void finalizarCompra(){
        tipoPago.pagar();
    }
}

