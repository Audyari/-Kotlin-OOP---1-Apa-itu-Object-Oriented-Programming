package data

//19. toString Function
class Car{
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    override fun toString(): String {
        return "Car(brand='$brand', model='$model', year=$year)"
    }
}

