/**
 * BOLETÍN DE EJERCICIOS DE CLASES EN KOTLIN
 *
 * Realizamos varios ejercicios contenidos en el boletín 3.1 de Kotlin
 *
 */
fun claseTiempo() {
    print("Escriba un numero de horas: ")
    var hora1 = try {
        readLine()!!.toByte()
    } catch (_: Exception) {
        0
    }
    print("Escriba un numero de minutos: ")
    var minuto1 = try {
        readLine()?.toByte()
    } catch (_: Exception) {
        0
    }
    print("Escriba un numero de segundos: ")
    var segundo1 = try {
        readLine()?.toByte()
    } catch (_: Exception) {
        0
    }
    var tiempo1 = Tiempo(hora1, minuto1, segundo1)
    println("$tiempo1")
}


fun main() {
/*
    // Ejercicio 5.6
    var rectangulo1 = Rectangulo(10.1, 5.2) //Primer objeto rectangulo
    var rectangulo2 = Rectangulo(6.4, 2.8) //Segundo objeto rectangulo

    println("$rectangulo1") //Imprimimos la información del primer ejemplo
    println("$rectangulo2") // Imprimimos la información del segundo objeto


    //Ejercicio 5.7
    var coche1 = Coche("Audi", "A4", "Negro", 140, 4, "4044JME")
    var coche2 = Coche("Peugeot", "208", "Blanco", 75, 4, "4087JMD")
    var coche3 = Coche("Renault", "Clio", "Rojo", 75, 4, "7152HYB")
    var coche4 = Coche("Mini", "Cooper", "Rosa", 90, 2, "9200BDJ")

    println("$coche1")
    coche1.color = "Azul"
    println("$coche1")

    println("$coche2")
    coche2.color = "Amarillo"
    println("$coche2")

    println("$coche3")
    coche3.color = "Rosa"
    println("$coche3")

    println("$coche4")
    coche4.color = "Blanco"
    println("$coche4")


    //Ejercicio 5.8
    claseTiempo()


    //Ejercicio 5.9
    var persona1 = Persona("32543781Y")

    var listacuentas = listOf<Cuenta>(Cuenta("N1", 0.0),
                                        Cuenta("N2", 700.0),
                                        Cuenta("N1", 0.0))

    listacuentas.forEach{println(persona1.insertCuenta(it))}

    persona1.listadoCuentas[0]?.recibeAbonos(1100.0)
    persona1.listadoCuentas[1]?.realizaPagos(750.0)

    println(persona1.esMorosa())

*/
    //Ejercicio 5.10
    /*var libros: Array<Libro?> = arrayOf(Libro("La colmena", "Camilo Jose Cela", 336, 8),
        Libro("La metamorfosis", "Franz Kafka", 128, 9))

    var conjuntoLibros = ConjuntoLibros(libros)*/

    //println(conjuntoLibros.caliLibro())
    //conjuntoLibros.muestraConjunto()

    val numbers = listOf(1,2,3)
    println(numbers.map {it * it}) //Devuelve [1,4,9]







}