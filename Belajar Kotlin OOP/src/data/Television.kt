package data

class Television {
    lateinit var brand: String

    fun initTelevision(brand: String) {
        this.brand = brand
    }
}

fun main() {
    val television = Television()
    television.initTelevision("Samsung")
    println(television.brand)
}