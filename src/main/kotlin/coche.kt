/**
 * Un coche tiene:
como atributos: Marca, Modelo, #gasolina, Color (defecto blanco), #tanque,
#variacionVelocidad=5, #velocidadMax, #factorGasto (Double), #numeroMarchas

como acciones: encender, apagar, iniciar, parar, acelerar, frenar, incrementaMarcha, decrementaMarcha, llenarTanque
además podremos preguntarle por la descripción del coche, el estado, la marcha actual, la velocidad actual

Crea una clase coche, y compruebe mediante require en el bloque init que el argumento marca no es nulo.
la velocidad es mayor que 10 y menor que 250.

encender: Devuelve true si enciende. Solo enciende si no esta encendido, NO tiene marcha metida y tiene gasolina

apagar: Vuelve al estado inicial ¿necesitas alguna propiedad o método adicional?

iniciar: Solo inicia si esta encendido (No andando). El proceso será establecer marcha 1 y acelerar.

acelerar: Devuelve la velocidad a la que va, solo acelera (+variacionVelocidad) si tiene gasolina,
si no envía mensaje y llama al método parar. No puede superar velocidadMax.

¿cuanto gasta? Siempre que acelera gasta según lo siguiente: marcha->gasto: 1->5, 2->4, 3->3, 4->2, 5->1. Gasto se multiplica por factorGasto

cambia marcha: establece la marcha en la que va: incrementaMarcha, decrementaMarcha.
Hay que comprobar que no es menor que 0, ni mayor que el numero de marchas.

frenar: Devuelve la velocidad a la que va, (-variacionVelocidad) cada vez que se frena,
ademas en cada frenado se llama a actualizar el gasto de gasolina

parar: Devuelve true al parar. Tiene sentido si esta moviéndose.
El proceso sería Llamar a frenar hasta que la velocidad =0, y establece marcha 0.

 */

class Coche3(
    private val marca: String,
    private val modelo: String,
    private var tipoCombustible: String,
    private var color: String,
    private var cantidadCombustible: Float,
    private var capacidadCombustible: Float,
    private var factorGasto: Double,
    private var numeroMarchas: Int,
    private var velocidadMaxima: Int,
) {
    private val variacionVelocidad: Int = 10 //La variación de velocidad será una constante común para todos los coches
    private var arrancado: Boolean = false //Una variable de estado que por defecto está a false
    private var marcha: Int = 0 //La marcha 0 es punto muerto
    private var velocidadActual: Int = 0
    private var gasto = 0.0


    init {
        require(marca.isNotEmpty()) { "Error: La marca introducida no es correcta o no ha introducido marca." }
        require(velocidadMaxima < 250) { "Error. La velocidad maxima introducida no es correcta." }

        if (color.length < 0) {
            color = "blanco"
        }

        if (capacidadCombustible == 0.0F) {
            capacidadCombustible = 55.0F
        } else if (capacidadCombustible < 30.0F) {
            capacidadCombustible = 30.0F
        }
    }

    fun infoCoche(): String {
        val infoarranque = if (arrancado) {
            "Si"
        } else {
            "No"
        }
        return "*** Información del vehiculo ***" +
                "Marca del vehiculo: $marca \n" +
                "Modelo del vehiculo: $modelo \n" +
                "Tipo de combustible utilizado: $tipoCombustible \n" +
                "Color del vehículo: $color \n" +
                "Combustible disponible: $cantidadCombustible \n" +
                "¿Está arrancado?: $infoarranque" +
                "Velocidad actual: $velocidadActual" +
                "********** Fin de info *********"
    }

    fun arrancar(): Boolean {
        return if ((cantidadCombustible > 0.0F) && (!arrancado) && (marcha == 0)) {
            arrancado = true
            true
        } else {
            false
        }
    }

    fun apagar(): Boolean {
        return if ((arrancado) && (marcha == 0)) {
            arrancado = false
            true
        } else {
            false
        }
    }

    fun iniciarMarcha() {

    }

    fun parar() {}
    fun acelerar() {}
    fun frenar() {}

    fun incrementaMarcha(): Boolean {
        return if (marcha < numeroMarchas) {
            marcha++
            true
        } else {
            false
        }
    }

    fun decrementaMarcha(): Boolean {
        return if (marcha > 0) {
            marcha--
            true
        } else {
            false
        }
    }
}

fun llenarTanque() {

}

fun main() {

}