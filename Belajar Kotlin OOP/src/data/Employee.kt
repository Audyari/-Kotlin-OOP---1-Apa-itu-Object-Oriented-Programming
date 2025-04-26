package data

//13. Inheritance
open class Employee(
    var name: String,
) {
    open fun sayHello(name: String) {
        println("Hello $name my name is ${this.name}, I'm an Employee")
    }
}

final class Manager(name: String) : Employee(name)
final class VicePresident(name: String) : Employee(name)