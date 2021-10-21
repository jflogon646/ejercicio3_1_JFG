/**
 * BOLETÍN DE EJERCICIOS DE CLASES EN KOTLIN
 *
 * Realizamos varios ejercicios contenidos en el boletín 3.1 de Kotlin
 *
 */

fun main() {

    // Ejercicio 5.6
    var rectangulo1 = Rectangulo(10.1, 5.2) //Primer objeto rectangulo
    var rectangulo2 = Rectangulo(6.4, 2.8) //Segundo objeto rectangulo

    println("$rectangulo1") //Imprimimos la información del primer ejemplo
    println("$rectangulo2") // Imprimimos la información del segundo objeto


    //Ejercicio 5.7
    var coche1 = Coche("Audi","A4","Negro",140,4,"4044JME")
    var coche2 = Coche("Peugeot","208","Blanco",75,4,"4087JMD")
    var coche3 = Coche("Renault","Clio","Rojo",75,4,"7152HYB")
    var coche4 = Coche("Mini","Cooper","Rosa",90,2,"9200BDJ")

    println("$coche1")
    coche1.color= "Azul"
    println("$coche1")

    println("$coche2")
    coche2.color= "Amarillo"
    println("$coche2")

    println("$coche3")
    coche3.color= "Rosa"
    println("$coche3")

    println("$coche4")
    coche4.color= "Blanco"
    println("$coche4")

    //Ejercicio 5.8



}