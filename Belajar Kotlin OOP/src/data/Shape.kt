package data


open class Shape {
    open val corner: Int = -1
    
    open fun printName() {
        println("This is Shape")
    }
}

open class Rectangle : Shape() {
    // 15. Properties Overriding
    override val corner: Int = 4

    // 16. Super Keyword
    open val superCorner: Int = super.corner

    // 17. Super Function
    override fun printName() { 
        println("This is Rectangle, parent is:")
        super.printName() 
    }

    // 18. Super Keyword with Function
    open fun callSuperPrintName() {
        val superCorner = super.corner
        super.printName()
    }
}

class Triangle : Rectangle() {
    
    // 19. Super Keyword with Property
    override val superCorner: Int = super.corner

    // 20. Super Keyword with Function
    override fun printName() {
        println("This is Triangle, parent is:")
        super.printName() 
    }

    // 21. Super Keyword with Function
    override fun callSuperPrintName() {
        val superCorner = super.corner
        super.printName()
        println("Triangle: $superCorner")
    }
}
