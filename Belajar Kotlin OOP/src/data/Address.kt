package data

//8. tanpa primary constructor
class Address{
    var street: String = ""
    var city: String = ""
    var state: String = ""
    var zip: String = ""

    constructor(paramStreet: String, paramCity: String, paramState: String){
        street = paramStreet
        city = paramCity
        state = paramState

        println("tanpa primary constructor 1")

    }

    constructor(paramStreet: String, paramCity: String, paramState: String, paramZip: String){
        street = paramStreet
        city = paramCity
        state = paramState
        zip = paramZip

        println("tanpa primary constructor 2")

    }

}
