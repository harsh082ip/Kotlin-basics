

import kotlin.text.toInt
fun  main() {

    var age : String? = readLine()
    val intValue: Int? = age?.toInt()

    println(intValue)
    if (intValue != null) {
        if(intValue >= 18) {
            println("Eligible for voting")
        }
        else if(intValue < 5) {
            println("Don't even go close near voting pannel")
        }
        else{
            println("Not Eligible for voting")
        }
    }

    // Kotlin Expressions
    // In Kotlin, you can also use if..else statements as 
    // expressions (assign a value to a variable and return it):

    val time = 20
    var greeting = if(time < 18) {
        "Good Day"
    } else {
        "Good Evening"
    }
    println(greeting)
}