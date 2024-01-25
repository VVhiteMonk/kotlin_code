fun main() {
    println("Lesson IV")
    val userAge = 34
    val answer = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
    val answer2 = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE

    println(answer2)

    println("Answer it is - $answer")


    val a = true;
    val b = !a
    println(b)
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65