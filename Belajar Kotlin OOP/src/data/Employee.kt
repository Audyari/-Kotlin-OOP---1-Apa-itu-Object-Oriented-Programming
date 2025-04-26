package data

//13. Inheritance
open class Employee(
    var name: String,
) {
    open fun sayHello(name: String) {
        println("Hello $name my name is ${this.name}, I'm an Employee")
    }
}
final class Manager(name: String) : Employee(name){
    // 14. Function Overriding
    override fun sayHello(name: String) {
        println("Hello $name my name is ${this.name}, I'm a Manager")
    }
}
final class VicePresident(name: String) : Employee(name){
    // 14. Final Override Function
    override fun sayHello(name: String) {
        println("Hello $name my name is ${this.name}, I'm a Vice President")
    }
}