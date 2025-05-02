package app

import data.Car

fun main() {
    val car = Car()
    car.brand = "Toyota"
    car.model = "Camry"
    car.year = 2022
    println(car)
}
