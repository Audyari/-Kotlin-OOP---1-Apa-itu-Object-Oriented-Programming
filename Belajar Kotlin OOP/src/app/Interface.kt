package app

import data.Human
import data.Interaction

fun main() {

   // 1. Membuat objek Human
   val human = Human("Audyari")
    
   // 2. Memanggil sayHello dari Human (yang meng-override interface)
   human.sayHello("Putri")  // Output: "Hello Putri, my name is Audyari and I'm a Human"
   
   // 3. Memanggil sayHello dari interface
   human.panggilSayHelloInterface()

   human.go()
   human.move()

}
