package data

// 23. Abstract Class
abstract class Location(val name: String)

class City(name: String) : Location(name)

fun main() {
    val city = City("Jakarta")
    println(city.name)

}