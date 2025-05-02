package data

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat : Animal() {
    override val name: String = "Cat"
    override fun run() {
        println("Cat is running")
    }
}

fun main() {
    val cat = Cat()
    println(cat.name)
    cat.run()
}
