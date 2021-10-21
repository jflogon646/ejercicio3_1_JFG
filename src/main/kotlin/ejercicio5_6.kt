class Rectangulo(val base: Double, val altura: Double) {

    fun perimetro(): Double {
        return (base * 2) + (altura * 2)
    }

    fun area(): Double {
        return base * altura
    }

    override fun toString(): String {
        return "Base: $base cm \nAltura: $altura cm \nArea: ${this.area()} cm^2\nPerimetro: ${this.perimetro()} cm\n" +
                "-".repeat(25)
    }
}