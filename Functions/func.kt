fun main() {
    
    myFunc()
    myFunc2("Harsh")
    var res = myFunction(12)
    println(res)

    // calling shorter syntax
    var result = myFunction2(3, 5)
    println(result)
}

fun myFunc() {
    println("I just got executed!!")
}

fun myFunc2(num : String) {
    println(num)
}

fun myFunction(x: Int): Int {
    return (x + 5)
}

// Shorter Syntax for Return Values

fun myFunction2(x: Int, y: Int) = x + y