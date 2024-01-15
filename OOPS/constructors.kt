class Person(var FirstName : String, var LastName : String, var age : Int) {

    fun checVotingkEligiblity() {
        if (age >= 18) {
            println("Eligible for voting")
        }
        else if ( age <= 5) {
            println("Don't Even dare to go close the voting pannel")
        }
        else {
            println("Eligible fr!!")
        } 
    }

    fun displayDetails() {

        println("Name : ${FirstName + " " + LastName} \nAge : $age")
    }
}

fun main() {

    var p1 = Person("Harsh Vardhan", "Singh", 18)
    p1.checVotingkEligiblity()
    p1.displayDetails()
}