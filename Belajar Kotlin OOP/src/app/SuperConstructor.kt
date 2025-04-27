package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer


fun main() {

    val customer1 = Customer("Muzammil", "standard")
    val customer2 = PremiumCustomer("Muzammil", 100000)
    val customer3 = ExecutiveCustomer("Muzammil", 100000)

    customer1.display()
    customer2.display()
    customer3.display()
}
