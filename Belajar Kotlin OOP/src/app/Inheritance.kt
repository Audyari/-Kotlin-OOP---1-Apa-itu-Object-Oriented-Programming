package app

import data.Employee
import data.Manager
import data.VicePresident


fun main(){

    val func1 = Employee("Employee")
    func1.sayHello("Audyari")

    val func2 = Manager("Manager")
    func2.sayHello("Audyari Manager")

    val func3 = VicePresident("Vice President")
    func3.sayHello("Audyari Vice President")

}
