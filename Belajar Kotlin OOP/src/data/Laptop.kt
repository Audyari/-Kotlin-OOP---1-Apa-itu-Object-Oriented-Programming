package data


// 18. Any Class
open class Laptop(var name: String) {
    
    override fun toString(): String {
        return "Laptop(name='$name')"
    }
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Laptop) return false
        return name == other.name
    }
    
    override fun hashCode(): Int {
        return name.hashCode()
    }
}

class Handphone(var name: String) {
    
    override fun toString(): String {
        return "Handphone(name='$name')"
    }
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Handphone) return false
        return name == other.name
    }
    
    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun main() {
    val laptop = Laptop("MacBook Pro")
    val handphone = Handphone("iPhone 12")
    
    println(laptop.name)
    println(laptop.toString())
    println(handphone.name)
    println(handphone.toString())

    println(laptop == laptop) // true
    println(laptop.hashCode())
    println(laptop.toString())

}