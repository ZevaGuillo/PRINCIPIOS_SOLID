package OCP.Incorrecto;

public class Cafeteria {

    public double getTotal(double cantidad, TipoCafe tipoCafe){
        double total = 0;

        switch (tipoCafe){
            case LATTE:
                total = cantidad * 3.5;
                break;
            case AMERICANO:
                total = cantidad * 2;
                break;
            case CAPUCHINO:
                total = cantidad * 4;
                break;
        }

        return total;
    }
}
