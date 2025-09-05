public class CuentaBancaria {
    int numeroCuenta;
    String tipoCuenta;
    double saldo;
    public CuentaBancaria(){

    }
    public CuentaBancaria(String tipoCuenta , int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    public CuentaBancaria(String tipoCuenta, int numeroCuenta, double saldo){
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public String toString() {
        return "Tipo de Cuenta: " + tipoCuenta + "\n" +
                "Numero de cuenta: " + numeroCuenta + "\n" +
                "Saldo: " + saldo + "$";
    }
}
