
package data

// 21. equals Function
class Company (val name: String) {
   
     override fun equals(other: Any?) : Boolean {
         return when (other) {
             is Company -> name == other.name
             else -> false
         }
     }

    // 22. HashCode Function
     override fun hashCode(): Int {
         return name.hashCode()
     }
}

fun main() {
    val company1 = Company("Google")
    val company2 = Company("Google")
    val company3 = Company("Facebook")

    println(company1 == company2) // true
    println(company1 == company3) // false

    println(company1.hashCode())
    println(company2.hashCode())
    println(company3.hashCode())
}
