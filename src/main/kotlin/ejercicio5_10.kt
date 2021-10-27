class Libro(var titulo: String,var autor: String,var NumeroPaginas: Int,cali: Byte) {
    var calificacion: Byte
    init {
        if (cali > 10) {
            calificacion = 10
        } else if (cali!! < 0) {
            calificacion = 0
        } else {
            calificacion = cali
        }
    }

    override fun toString(): String {
        return "Titulo del libro: $titulo\nAutor: $autor\nNúmero de páginas: $NumeroPaginas\nCalificación(0-10): $calificacion"
    }

}
class ConjuntoLibros() {

}