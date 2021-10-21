class Tiempo (var hora: Byte,minuto: Byte? = 0,segundo: Byte? = 0){
    var minuto = minuto
    var segundo = segundo

    override fun toString(): String {
        return  "${hora}h ${minuto}m ${segundo}s"
    }
}