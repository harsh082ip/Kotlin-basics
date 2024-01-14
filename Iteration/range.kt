fun main() {
    
//     Kotlin Ranges
// With the for loop, you can also create ranges of values with "..":

    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 1..10) {
        println(nums)
    }

    // Check if a value exists

    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
    println("It does not exist.")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }   
}