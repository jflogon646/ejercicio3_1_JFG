//import javafx.beans.binding.When

class Cuenta(val numeroCuenta: String, saldo: Double? = 0.0) {

    var saldo = saldo
    fun consultaSaldo(): String {
        return "El saldo de la cuenta es ${this.saldo}"
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

    fun insertCuenta(cuenta: Cuenta): String {

        var mensaje: String = "La persona ${this.dni} tiene le máximo de cuentas.\n Max: 3."
        var i: Int = 0
        var check: Int = 0
        while (check == 0) {
            when {
                listadoCuentas[i] == null -> {
                    listadoCuentas[i] = cuenta
                    mensaje = "La cuenta $cuenta ha sido añadida con exito a la posicion $i."
                    check = 1
                }
                listadoCuentas[i]!!.numeroCuenta == cuenta.numeroCuenta-> {
                    mensaje = "La cuenta ${cuenta.numeroCuenta} ya ha sido añadida a la persona ${this.dni}."
                    check = 1
                }
                else -> {
                    i++
                }

            }

        }
        return mensaje
    }

    fun esMorosa(): String {
        var mensaje: String = "La persona ${this.dni} no tiene cuentas en negativo."
        for (cuenta in listadoCuentas) {
            if (cuenta != null) {
                if (cuenta.saldo!! < 0.0) {
                    mensaje =
                        "La persona ${this.dni} tiene cuentas en negativo.\nEl saldo de la cuenta ${cuenta.numeroCuenta} es de ${cuenta.saldo}."
                }
            }
        }
        return mensaje
    }

    override fun toString(): String {
        return "La persona ${this.dni} tiene ${this.listadoCuentas.size}."
    }
}