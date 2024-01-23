fun main(){
    println("Lesson II")

    val a = 5
    val b = 7

    val sum = a + b

    //println(a + b)
    println(sum)
    println(sum::class.simpleName) // Int

    val  boom = "boom"
    println( boom + " is type -" + boom::class.simpleName)

    println(10 % 3)
    println(10 % 2)
}
