package data

interface Interaction {
    val name: String
    
    // Concrete Function di Interface
    fun sayHello(name: String): Unit{
        println("Hello $name, my name is ${this.name} and I'm an Interaction")
    }
}

// Multiple Inheritance
interface Go : Interaction {
    fun go(): Unit{
        // Inheritance antar Interface
        println("I can go ${this.name}")
    }
}

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human(override val name: String) : Interaction, Go, MoveA, MoveB {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name} and I'm a Human")
       
    }

    fun panggilSayHelloInterface(){
        super<Interaction>.sayHello("Putri")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }




}



