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




//////////////////////////////

Urutan Umum dalam OOP :

1. Membuat Class: Tentukan kelas yang akan digunakan. Ini adalah langkah pertama untuk mendefinisikan struktur data dan perilaku.

2. Membuat Properties: Tentukan properti (atribut) dalam kelas. Ini menggambarkan karakteristik objek.

3. Constructor: Definisikan konstruktor (baik primer maupun sekunder) untuk menginisialisasi objek

4. Initializer Block: Gunakan blok inisialisasi jika Anda perlu menjalankan kode tambahan setelah konstruktor.

5. Membuat Object: Buat instance dari kelas (objek).

6. Memanipulasi Property: Akses dan modifikasi properti objek yang telah dibuat.

7. Secondary Constructor: Jika perlu, Anda bisa mendefinisikan konstruktor sekunder untuk kasus penggunaan spesifik.

8. Properties di Constructor: Anda bisa mendefinisikan properti langsung di konstruktor jika diinginkan.

9. Tanpa Primary Constructor: Ini biasanya kurang disarankan, tetapi Anda bisa membuat kelas tanpa konstruktor primer jika Anda memerlukan kontrol yang lebih spesifik.



/// contoh lengkap : 

class Address(var street: String, var city: String) {
    init {
        println("Address created: $street, $city")
    }

    constructor(street: String) : this(street, "Unknown")

    fun display() {
        println("Street: $street, City: $city")
    }
}

fun main() {
    val myAddress = Address("123 Main St", "Springfield")
    myAddress.display()

    val anotherAddress = Address("456 Elm St")
    anotherAddress.display()
}