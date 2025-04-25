package app

import data.Address

fun main() {
    
    val address1 = Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung")

    println(address1.street)
    println(address1.city)
    println(address1.state)
    println(address1.zip)
    println("====================")

    val address2 = Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung", "12345")
    println(address2.street)
    println(address2.city)
    println(address2.state)
    println(address2.zip)
    println("====================")
    
}

