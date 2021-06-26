package OCP.Correcto;

public interface PagoCafeteria {
    public abstract double getTotal(double cantidad);
}

class Capuchino implements PagoCafeteria{
    @Override
    public double getTotal(double cantidad) {
        return cantidad * 4;
    }
}

class Americano implements PagoCafeteria{
    @Override
    public double getTotal(double cantidad) {
        return cantidad * 2;
    }
}

class Latte implements PagoCafeteria{
    @Override
    public double getTotal(double cantidad) {
        return cantidad * 3.5;
    }
}