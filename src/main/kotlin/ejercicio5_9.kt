class Cuenta(val numeroCuenta: String,var saldo: Double) {

    fun consultaSaldo(): String {
        return "El saldo de la cuenta es $saldo"
    }
    fun recibeAbonos(valor: Double): String {
        saldo += valor
        return "El saldo de la cuenta $numeroCuenta es de $saldo"
    }
    fun realizaPagos(valorPago: Double): String{
        saldo -= valorPago
        return "El saldo de la cuenta $numeroCuenta es de $saldo"
    }
}

class Persona(val dni: String){

}