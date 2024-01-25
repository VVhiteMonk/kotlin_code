fun main(){

    println("How are you old? ")
    val userYear = readLine()!!.toInt()

    if (userYear >= AGE_OF_EIGHTEEN){
        println("RUN ")
    }else{
        println("Not RUN")
    }

    println("New program")
    val ifValue  = if (10 > 5) "Text is ten over five"
    else "false text is it."

    println(ifValue)

    println("Input 1-5 ")
    val number = readLine()!!.toInt()

    when(number){
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        else -> println("false")
    }

}

const val AGE_OF_EIGHTEEN= 18