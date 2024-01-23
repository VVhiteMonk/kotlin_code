fun main(){
    println("Lesson III")

    val greetings  = "Hello"
    val space = ' ';
    val name = "Vitalijus"

    println(greetings + space + name)

    println("$greetings my friend $name")

    println("54 + 43 = ${54+43}")

    val multiString = """
        page 1
        page 2
        page 3
    """.trimIndent()

    println(multiString)
}