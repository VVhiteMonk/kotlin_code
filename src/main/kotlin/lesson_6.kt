fun main(){
    println("VI Lesson - While, do while")

    var counter = 5
    var counterDo = 5

    while (counter > 0) {
        println("the ad will end - ${counter--}")
        Thread.sleep(1000)
    }

    println("Do while ")

    do{
        println("the ad will end - ${counterDo--}")
        Thread.sleep(1000)
    }while (counterDo > 0)
}