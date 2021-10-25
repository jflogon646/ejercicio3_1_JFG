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
    var listadoCuentas: MutableList<String> = mutableListOf<String>()
    fun añadeCuentas (cuenta: Cuenta): String {
        var mensaje: String = ""
        if (listadoCuentas.size < 3) {
            listadoCuentas.add(cuenta.numeroCuenta)
            mensaje = "La cuenta ${cuenta.numeroCuenta} ha sido añadida a ${this.dni}. \n "
        } else {
            mensaje = "La persona ${this.dni} ha alcanzado el máximo de cuentas. \nNumero de cuentas asignadas: ${listadoCuentas.size}."
        }
        return mensaje
    }
    fun esMorosa (): String {
        for (cuenta in listadoCuentas) {

        }
        return "hola"
    }
}