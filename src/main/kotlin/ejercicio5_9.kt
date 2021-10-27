//import javafx.beans.binding.When

class Cuenta(val numeroCuenta: String, saldo: Double? = 0.0) {

    var saldo = saldo
    fun consultaSaldo(): Double? {
        return this.saldo
    }

    fun recibeAbonos(valor: Double) {
        saldo = saldo?.plus(valor)
    }

    fun realizaPagos(valorPago: Double) {
        saldo = saldo?.minus(valorPago)
    }

    override fun toString(): String {
        return this.numeroCuenta
    }

}

class Persona(val dni: String) {
    var listadoCuentas: Array<Cuenta?> = arrayOfNulls<Cuenta>(3)

    fun insertCuenta(cuenta: Cuenta) {

        var i: Int = 0
        var check: Int = 0
        while (check == 0) {
            when {
                i > 2 -> {
                    check = 1
                }
                listadoCuentas[i] == null -> {
                    listadoCuentas[i] = cuenta
                    check = 1
                }
                listadoCuentas[i]!!.numeroCuenta == cuenta.numeroCuenta-> {
                    check = 1
                }
                else -> {
                    i++
                }

            }

        }
    }

    fun esMorosa(): Boolean {
        var mensaje: Boolean = false
        for (cuenta in listadoCuentas) {
            if (cuenta != null) {
                if (cuenta.saldo!! < 0.0) {
                    mensaje = true
                }
            }
        }
        return mensaje
    }
}