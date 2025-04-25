import data.Address
import data.Person

fun main(){

    val audy = Person("Audyari", " ", "Wiyono")
    audy.firstName = "Audyari"
    audy.middleName = " "
    audy.lastName = "Wiyono"

    println("====================")
    println(audy.firstName)
    println(audy.middleName)
    println(audy.lastName)
    println("====================")

    //Secondary Constructor dengan 2 parameter
    val audy2 = Person("Audyari con", "Wiyono con")


    println(audy2.firstName)
    println(audy2.middleName)
    println(audy2.lastName)
    println("====================")

    //Secondary Constructor dengan satu parameter
    val audy3 = Person("Audyari con")


    println(audy3.firstName)
    println(audy3.middleName)
    println(audy3.lastName)
    println("====================")

    //8. tanpa primary constructor
    val address = Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung")

    println(address.street)
    println(address.city)
    println(address.state)
    println(address.zip)
    println("====================")

    val address2 = Address("Jl. Arief Rizal", "Bandar Lampung", "Lampung", "12345")
    println(address2.street)
    println(address2.city)
    println(address2.state)
    println(address2.zip)
    println("====================")
    
}