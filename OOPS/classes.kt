

// import Car
class Car {
    var brand = ""
    var model = ""
    var year = 0

    fun display() {
        println("$brand, $model, $year")
    }
}



fun main() {

    var c1 = Car()
    c1.brand = "Mercedes"
    c1.model = "Mercedes Benz CLE couple"
    c1.year = 2024

    println(c1.toString())
    c1.display()
}