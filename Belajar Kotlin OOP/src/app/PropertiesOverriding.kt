package app

import data.Shape
import data.Rectangle
import data.Triangle

fun main() {
    val shape = Shape()
    val rectangle = Rectangle()

    println(shape.corner)
    println(rectangle.corner)
    println(rectangle.superCorner)

    rectangle.printName()
    shape.printName()

    // 22. Super Keyword with Function
    val triangle = Triangle()
    triangle.printName()
    triangle.callSuperPrintName()
}
