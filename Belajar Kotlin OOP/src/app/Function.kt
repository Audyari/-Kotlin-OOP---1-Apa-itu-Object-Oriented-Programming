package app

import data.Student


fun main(){

    val func = Student("AI",41,"Pria")

    func.display()
    func.sayHello("Audyari")

    func.sayHello("Audyari", 19)
}
