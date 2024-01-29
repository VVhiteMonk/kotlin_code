fun main(){
    println("Lesson VII")

    val range1 = 1 .. 10

    val a = 1 in range1
    val b = 1 !in range1

    println(a)
    println(b)

    println("For ")

    for (i in 5 downTo 1){
        println("the ad will end - $i")
        Thread.sleep(1000)
    }

    val range2  = 1 .. 100

    for (i in range2 step 7){
        println(i)
    }
}