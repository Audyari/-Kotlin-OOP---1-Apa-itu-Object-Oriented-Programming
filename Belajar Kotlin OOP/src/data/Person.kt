package data

//2. Constructor
class Person(firstNameParam: String, lastNameParam: String, middleNameParam: String){

    //3. Initializer Block
    init {
        println("Initializing Person object with firstName: $firstNameParam, middleName: $middleNameParam, lastName: $lastNameParam")
    }

    //4. Secondary Constructor
    constructor(firstNameParam: String, lastNameParam: String) :
           this(firstNameParam, null.toString(), lastNameParam){
                println("Secondary constructor dengan 2 parameter")
           }

    //4. Secondary Constructor
    constructor(firstNameParam: String) :
            this(firstNameParam, " ", " "){
                println("Secondary constructor called dengan 1 parameter")
            }

    //1. Property
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam

}