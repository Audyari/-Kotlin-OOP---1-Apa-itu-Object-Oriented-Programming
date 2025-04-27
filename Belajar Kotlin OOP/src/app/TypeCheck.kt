package app

import data.Address
import data.Customer

fun TypeCheck(any: Any) {

    when(any) {
        is String -> println("String: ${any}")
        is Int -> println("Integer: ${any}")
        is Double -> println("Double: ${any}")
        is Boolean -> println("Boolean: ${any}")
        //Casts
        is Address -> println("Address: ${any.street}")
        is Customer -> println("Customer: ${any.name}")
        else -> println("Unknown type: ${any}")
    }
}

fun TypeCheck2(any: Any) {

    if (any is String) println("String: ${any}")
    else if (any is Int) println("Integer: ${any}")
    else if (any is Double) println("Double: ${any}")
    else if (any is Boolean) println("Boolean: ${any}")
    else if (any is Address) println("Address: ${any.street}")
    else if (any is Customer) println("Customer: ${any.name}")
    else println("Unknown type: ${any}")
}

//Unsafe Casts
fun printString(any: Any) {
    // Safe Nullable Casts

    if (any is String) {
        val value = any
        println("String: $value")
    } else {
        println("It's not a String")
    }
}

fun main() {
    printString("Hello World")
    printString(123)
    printString(3.14)
    printString(true)
    printString(Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung"))
    printString(Customer("Muzammil", "standard"))


    TypeCheck("Hello World")
    TypeCheck(123)
    TypeCheck(3.14)
    TypeCheck(true)
    TypeCheck(Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung"))
    TypeCheck(Customer("Muzammil", "standard"))

    TypeCheck2("Hello World")
    TypeCheck2(123)
    TypeCheck2(3.14)
    TypeCheck2(true)
    TypeCheck2(Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung"))
    TypeCheck2(Customer("Muzammil", "standard"))

    printString("Hello World")
    printString(123)

}
