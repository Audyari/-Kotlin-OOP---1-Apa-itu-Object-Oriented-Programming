"# -Kotlin-OOP---1-Apa-itu-Object-Oriented-Programming" 

1. Membuat Class
2. Membuat Object
3. Membuat Property
4. memanipulasi Property
5. Constructor
6. Initializer Block
7. Secondary Constructor
8. tanpa primary constructor "kurang disarankan"
9. Properties di Constructor
10. Function
11. Overloading Function
12. This Keyword
13. Inheritance
14. Function Overriding
15. Properties Overriding
16. Super Keyword
17. Super Constructor






//////////////////////////////

Urutan Umum dalam OOP :

1. Membuat Class:

Kelas adalah cetak biru dari objek. Ini mendefinisikan properti dan metode yang dimiliki objek.

2. Membuat Object:

Objek adalah instansi dari kelas. Anda dapat membuat objek dengan menggunakan kata kunci new (di beberapa bahasa) atau langsung memanggil konstruktor.

3. Membuat Property:

Properti adalah atribut atau data yang dimiliki oleh kelas. Ini bisa berupa variabel yang menyimpan nilai.

4. Memanipulasi Property:

Anda dapat mengubah atau mengakses nilai properti objek menggunakan metode atau langsung.

5. Constructor:

Constructor adalah metode khusus yang dipanggil saat objek dibuat. Ini digunakan untuk menginisialisasi properti objek.

6. Initializer Block:

Blok inisialisasi adalah blok kode yang dijalankan saat objek dibuat, digunakan untuk mengeksekusi kode tambahan saat inisialisasi.

7. Secondary Constructor:

Kelas dapat memiliki lebih dari satu konstruktor, yang memungkinkan pembuatan objek dengan cara yang berbeda.

8. Tanpa Primary Constructor (kurang disarankan):

Meskipun mungkin untuk tidak memiliki konstruktor utama, ini bisa membingungkan dan tidak disarankan dalam banyak kasus.

9. Properties di Constructor:

Anda dapat mendeklarasikan properti langsung di dalam konstruktor untuk inisialisasi yang lebih ringkas.

10. Function:

Fungsi adalah metode yang didefinisikan dalam kelas, yang berisi logika untuk melakukan tindakan tertentu.

11. Overloading Function:

Anda dapat memiliki beberapa fungsi dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu kelas.

12. This Keyword:

Kata kunci this merujuk pada objek saat ini. Ini berguna untuk membedakan antara properti kelas dan parameter metode.

13. Inheritance:

Warisan memungkinkan kelas baru (subkelas) untuk mewarisi properti dan metode dari kelas yang ada (superkelas).

14. Function Overriding:

Subkelas dapat mendefinisikan kembali metode dari superkelas, memungkinkan perilaku yang berbeda untuk objek yang berbeda.


/// contoh lengkap : 

// 1. Membuat Class
open class Animal(val name: String) {

    // 3. Membuat Property
    var age: Int = 0

    // 5. Constructor
    init {
        println("Animal created: $name")
    }

    // 10. Function
    open fun makeSound() {
        println("Animal sound")
    }
}

// 7. Secondary Constructor
class Dog(name: String) : Animal(name) {
    
    var breed: String = ""

    // Secondary constructor
    constructor(name: String, breed: String) : this(name) {
        this.breed = breed
    }

    // 11. Overloading Function
    fun makeSound(barkCount: Int) {
        repeat(barkCount) { println("Woof!") }
    }

    // 14. Function Overriding
    override fun makeSound() {
        println("Bark!")
    }
}

// 2. Membuat Object
fun main() {
    // 8. Tanpa primary constructor (kurang disarankan)
    val cat = Animal("Cat").apply {
        age = 3
    }

    // 6. Initializer Block
    val dog = Dog("Buddy", "Golden Retriever").apply {
        age = 5
    }

    // 4. Memanipulasi Property
    println("${dog.name} is a ${dog.breed} and is ${dog.age} years old.")

    // 12. This Keyword
    dog.makeSound() // Calls the overridden method
    dog.makeSound(3) // Calls the overloaded method
}
fun main() {
    val myAddress = Address("123 Main St", "Springfield")
    myAddress.display()

    val anotherAddress = Address("456 Elm St")
    anotherAddress.display()
}