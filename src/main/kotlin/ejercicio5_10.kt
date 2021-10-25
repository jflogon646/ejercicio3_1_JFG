class Libro(var titulo: String,var autor: String,var NumeroPaginas: Int,cali: Byte?) {
    init {
        if (cali!! > 10) {
            var calificacion = 10
        } else if (cali!! < 0) {
            var calificacion = 0
        }

    }
}
class ConjuntoLibros() {}