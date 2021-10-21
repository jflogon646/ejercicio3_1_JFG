class Coche(
    var marca: String,
    var modelo: String,
    var color: String,
    var caballos: Int,
    var numPuertas: Byte,
    var matricula: String,
) {
    override fun toString(): String {
        return "Marca: $marca\nModelo: $modelo\nColor: $color\nCaballos del coche: $caballos\nNumero de puertas: $numPuertas\nMatricula: $matricula\n" +
                "-".repeat(25)
    }
}
