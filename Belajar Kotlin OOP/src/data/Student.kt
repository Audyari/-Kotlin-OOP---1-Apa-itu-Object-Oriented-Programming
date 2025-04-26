package data

class Student(var name: String, var age: Int, var gender: String)   {

    //10. function
    fun display(){
        println("Name: $name, Age: $age, Gender: $gender")
    }

    //10. function
    fun sayHello(yourName: String){
        println("Hello $yourName, my name is $name"  )
    }

    //11. Overloading Function
    fun sayHello(name: String, yourAge: Int){
        println("Hello $name, my name is $name and I'm $yourAge years old"  )
    }
    
    //12. Dengan This Keyword
    fun sayHello1(yourName: String, yourAge: Int){
        println("Hello $yourName, my name is ${this.name} and I'm ${this.age} years old"  )
    }
}