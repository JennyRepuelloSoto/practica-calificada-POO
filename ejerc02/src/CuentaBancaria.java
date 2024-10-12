public class CuentaBancaria {
    String nombreTitular;
    double saldo;
    String TipoCuenta;
    double deposito;
    double retiro;
    String operacion;
    public String getNombre() {
        return nombreTitular;
    }

    public void setNombre(String nombre) {
        this.nombreTitular= nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTCuenta() {
        return TipoCuenta;
    }

    public void setTCuenta(String TCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public double Deposito(){
        return (this.saldo+this.deposito);
    }
    public double Retiros(){
        return (this.deposito-this.Retiros());
    }
    public String Estado(){
        double saldoRestante = this.saldo;
        if( saldoRestante <100){
            return "Critico";
        }else if(saldoRestante>=100 && saldoRestante<=1000){
            return "mínimo";
        }else{
            return "Suficiente";
        }
    }
    public String tipoCuenta(){
        return (this.TipoCuenta);
    }

}

