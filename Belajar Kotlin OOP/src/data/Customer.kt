package data

//1. Parent Constructor

open class Customer(val name: String, val type: String, val balance: Long){
    
    // 2. Child Constructor
    constructor(name: String, type: String) : this(name, type, 0)
    
    // 3. Child Constructor
    constructor(name: String) : this(name, "standard")

    open fun display() {
        println("Name: $name, Type: $type, Balance: $balance")
    }
}

class PremiumCustomer : Customer {
    
    //17. Super Constructor
    constructor(name: String, type: String) : super(name, "Premium")
    
    //17. Super Constructor 
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
    
    override fun display() {
        println("Name: $name, Type: $type, Balance: $balance")
    }
    
}

class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance){

    constructor(name: String) : this(name, 0)

    override fun display() {
        println("Name: $name, Type: $type, Balance: $balance")
    }
}