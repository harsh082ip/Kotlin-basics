fun main() {

//     Kotlin Arrays
// Arrays are used to store multiple values in a 
// single variable, instead of creating separate variables for each value.

// To create an array, use the arrayOf() function, 
// and place the values in a comma-separated list inside it:

    var cars = arrayOf("Volvo", "BMW", "Mercedes", "Audi")

    print("[")
    for (c in cars) {
        print("$c, ")
    }
    print("]")

    val car = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(car[0])

    // print the size (how many elements are there in array)
    println(cars.size)


//     Check if an Element Exists
// You can use the in operator to check if an element exists in an array:

    if ("Volvo" in cars) {
    println("It exists!")
    } else {
    println("It does not exist.")
    }


//     Loop Through an Array
// Often when you work with arrays, you need to loop through all of the elements.

// You can loop through the array elements with the for loop, 
// which you will learn even more about in the next chapter.

// The following example outputs all elements in the cars array:

for (x in cars) {
    println(x)
  }
}