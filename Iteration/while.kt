

import kotlin.text.toInt
fun main() {

    // print table

    print("Enter number: ")
    val str_num : String? = readLine()
    val num : Int? = str_num?.toInt()

    
    if (num != null) {
        var i : Int = 1
        while(i <= 10) {
            println("$num * $i = ${num * i}")
            i++
        }
    } else {
        println("value is null")
    }

}