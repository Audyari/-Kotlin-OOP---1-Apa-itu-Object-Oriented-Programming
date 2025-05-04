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
18. Any Class
19. Type Check & Casts
20. toString Function
21. equals Function
22. HashCode Function
23. Abstract Class
24. Abstract Properties & Function
25. Getter dan Setter
26. Late Initialized Properties
27. Interface








//////////////////////////////

Urutan Umum dalam OOP :

1. Membuat Class: Mendefinisikan blueprint untuk objek.
2. Membuat Object: Membuat instance dari class.
3. Membuat Property: Menyusun atribut untuk menyimpan data dalam objek.
4. Memanipulasi Property: Mengubah nilai dari property objek.
5. Constructor: Metode khusus untuk menginisialisasi objek saat dibuat.
6. Initializer Block: Blok kode yang dijalankan sebelum constructor.
7. Secondary Constructor: Constructor tambahan untuk inisialisasi dengan cara berbeda.
8. Tanpa Primary Constructor: Tidak disarankan, tetapi mungkin digunakan dalam situasi tertentu.
9. Properties di Constructor: Menyediakan nilai untuk properties saat objek dibuat.
10. Function: Metode yang mendefinisikan perilaku objek.
11. Overloading Function: Mendefinisikan beberapa metode dengan nama yang sama tetapi parameter berbeda.
12. This Keyword: Merujuk pada instance saat ini dari objek.
13. Inheritance: Mekanisme untuk mewarisi properti dan metode dari class lain.
14. Function Overriding: Menyediakan implementasi baru untuk metode yang diwarisi.
15. Properties Overriding: Mengganti properti dari class induk di class anak.
16. Super Keyword: Merujuk pada class induk dalam konteks inheritance.
17. Super Constructor: Memanggil constructor dari class induk.
18. Any Class: Kelas yang dapat berisi berbagai tipe data.
19. Type Check & Casts: Memeriksa tipe objek dan melakukan casting jika diperlukan.
20. toString Function: Mengembalikan representasi string dari objek.
21. equals Function: Membandingkan dua objek untuk kesetaraan.
22. HashCode Function: Menghasilkan nilai hash untuk objek.
23. Abstract Class: Kelas yang tidak dapat diinstansiasi dan dapat memiliki metode abstrak.
24. Abstract Properties & Function: Properti dan metode yang harus diimplementasikan oleh subclass.
25. Getter dan Setter: Metode untuk mengakses dan memodifikasi nilai properti.
26. Late Initialized Properties: Properti yang diinisialisasi setelah objek dibuat.
27. Interface: Kontrak yang mendefinisikan metode yang harus diimplementasikan oleh kelas.


/// contoh lengkap : 

// 1. Membuat Class
abstract class Animal {
    // 3. Membuat Property
    abstract val name: String

    // 20. toString Function
    override fun toString(): String {
        return "Animal(name='$name')"
    }

    // 23. Abstract Class
    abstract fun makeSound()
}

// 2. Membuat Object
class Dog(override val name: String) : Animal() {
    // 14. Function Overriding
    override fun makeSound() {
        println("Woof!")
    }

    // 25. Getter dan Setter
    var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

// 5. Constructor
class Cat(override val name: String, var color: String) : Animal() {
    // 6. Initializer Block
    init {
        println("$name is a $color cat.")
    }

    // 14. Function Overriding
    override fun makeSound() {
        println("Meow!")
    }
}

// 9. Properties di Constructor
class Bird(private val species: String) : Animal() {
    override val name: String
        get() = species

    // 14. Function Overriding
    override fun makeSound() {
        println("Chirp!")
    }
}

// 13. Inheritance
class Bulldog(name: String, var weight: Int) : Dog(name) {
    // 15. Properties Overriding
    override var age: Int
        get() = super.age
        set(value) {
            super.age = value
        }

    // 16. Super Keyword
    fun printInfo() {
        println("Bulldog: $name, Weight: $weight kg, Age: $age years")
    }
}

// 19. Type Check & Casts
fun printAnimalSound(animal: Animal) {
    when (animal) {
        is Dog -> animal.makeSound()
        is Cat -> animal.makeSound()
        is Bird -> animal.makeSound()
    }
}

// 24. Abstract Properties & Function
interface CanFly {
    fun fly()
}

class Sparrow : Bird("Sparrow"), CanFly {
    override fun fly() {
        println("$name is flying!")
    }
}

// 27. Interface
fun main() {
    // 2. Membuat Object
    val dog = Dog("Buddy")
    dog.age = 3
    dog.makeSound()
    println(dog)

    val cat = Cat("Whiskers", "black")
    cat.makeSound()

    val bird = Sparrow()
    bird.fly()

    // 18. Any Class
    val animals: List<Animal> = listOf(dog, cat, bird)
    for (animal in animals) {
        printAnimalSound(animal)
    }

    // 10. Function
    val bulldog = Bulldog("Max", 25)
    bulldog.age = 5
    bulldog.printInfo()
}