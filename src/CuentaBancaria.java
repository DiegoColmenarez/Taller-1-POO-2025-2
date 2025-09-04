public class CuentaBancaria {
    int numeroCuenta;
    String tipoCuenta;
    double saldo;
    public CuentaBancaria(){
    }
    public CuentaBancaria(String cuentaTipo, int numCuenta){
        numCuenta = numeroCuenta;
        cuentaTipo = tipoCuenta;
    }
    public CuentaBancaria(String cuentaTipo, int numCuenta, double cantidadDinero){
        cuentaTipo = tipoCuenta;
        numCuenta = numeroCuenta;
        cantidadDinero = saldo;
    }
}
