/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello, World!!")
    
    val y = 19 // immutable variable
    var x : Byte = 12
    println(x)
    
    println(x.toString() + "World") // type cast
    
    println(3 + 5)
    
    println(x::class.simpleName) // print type of var
    
    var name : String = "Harsh Vardhan Singh"
    println(name::class.simpleName)
    
    var letter = 'A'
    println("$letter is of type ${letter.javaClass.simpleName}")
    println("$letter is of type ${letter::class.simpleName}")
    
//     val myLetter: Char = 66 // this will work in java but not in kotlin
// println(myLetter) // Error
    
}