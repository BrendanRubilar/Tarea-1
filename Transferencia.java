public class Transferencia extends Pago{

    private String Banco;
    private String NumeroCuenta;

    public Transferencia(String banco, String numeroCuenta) {
        Banco = banco;
        NumeroCuenta = numeroCuenta;
    }
}
