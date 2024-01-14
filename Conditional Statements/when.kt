

import kotlin.text.toInt
// Kotlin when
// Instead of writing many if..else expressions, 
// you can use the when expression, which is much easier to read.

// It is used to select one of many code blocks to be executed:
fun main() {

    print("Enter Day: ")
    val str_day : String? = readLine()
    val day : Int? = str_day?.toInt()

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day!"
    }

    println(result)
}