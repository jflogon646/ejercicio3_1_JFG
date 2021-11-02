class Libro(var titulo: String, var autor: String, var NumeroPaginas: Int, cali: Byte) {
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

    fun modificaTitulo(cambio: String) {
        this.titulo = cambio
    }

    fun modificaAutor(cambio: String) {
        this.autor = cambio
    }

    fun modificaPaginas(cambio: Int) {
        this.NumeroPaginas = cambio
    }

    fun modificaCali(cambio: Byte) {
        if (cambio < 0) {
            this.calificacion = 0
        } else if (cambio > 10) {
            this.calificacion = 10
        } else {
            this.calificacion = cambio
        }
    }

    override fun toString(): String {
        return this.titulo
        //"Titulo del libro: $titulo\nAutor: $autor\nNúmero de páginas: $NumeroPaginas\nCalificación(0-10): $calificacion"
    }

}

class ConjuntoLibros(conjunto: Array<Libro>) {
    var conjunto10: Array<Libro?> = arrayOfNulls<Libro>(10)

    init {
        var x = 0 //contador para conjunto de clase
        var y = 0 //contador auxiliar para casos que tengan mas de 10 libros
        if (conjunto.size <= 10) {
            for (libro in conjunto) {
                conjunto10[x] = libro
                x++
            }
        } else {
            while (x < 10) {
                conjunto10[x] = conjunto[y]
                x++
                y++
            }
        }
    }

    private fun conjuntoCompleto(): Boolean {
        var check: Boolean = true
        var x: Int = 0
        while (x < 9) {
            if (conjunto10[x] == null) {
                check = false
                x = 10
            } else {
                x++
            }
        }
        return check
    }

    fun insertLibro(libro: Libro): Boolean {
        var i: Int = 0
        var check: Int = 0
        var insertado: Boolean = false
        while (check == 0) {
            when {
                i > 9 -> {
                    check = 1
                }
                conjunto10[i] == null -> {
                    conjunto10[i] = libro
                    check = 1
                    insertado = true
                }
                conjunto10[i]!!.titulo == libro.titulo -> {
                    check = 1
                }
                conjuntoCompleto() -> {
                    check = 1
                }
                else -> {
                    i++
                }

            }

        }
        return insertado
    }
    private fun eliminaAutor(autor: String): Boolean {
        var eliminado: Boolean = false
        var i: Int = 0
        var check: Int = 0
        while (check == 0) {
            when {
                i > 9 -> {
                    check = 1
                }
                conjunto10[i]!!.autor == autor -> {
                    conjunto10[i] = null
                    eliminado = true
                    check = 1
                }
                else -> {
                    i++
                }

            }
        }
        return eliminado
    }
    private fun eliminaTitulo(titulo: String): Boolean {
        var eliminado: Boolean = false
        var i: Int = 0
        var check: Int = 0
        while (check == 0) {
            when {
                i > 9 -> {
                    check = 1
                }
                conjunto10[i]!!.titulo == titulo -> {
                    conjunto10[i] = null
                    eliminado = true
                    check = 1
                }
                else -> {
                    i++
                }

            }
        }
        return eliminado
    }

    fun eliminaLibros(libro: String, pClave: String): Boolean {
        var eliminado: Boolean = false
        var palabraClave = pClave.uppercase()
        when (palabraClave) {
            "AUTOR" -> {
                eliminado = eliminaAutor(libro)
            }
            "TITULO" -> {
                eliminado = eliminaTitulo(libro)
            }
        }
        return eliminado
    }
    fun caliLibro() {

    }
    fun muestraConjunto() {
        for (libro in conjunto10) {
            if (libro != null) {
                println("*".repeat(25))
                println("Titulo del libro: ${libro.titulo}\nAutor: ${libro.autor}\nNúmero de páginas: ${libro.NumeroPaginas}\nCalificación: ${libro.calificacion}")
                println("_".repeat(25))
            }
        }
    }
}