lateinit var number: String
lateinit var name: String
var serialNumbers: List<String> = listOf()

fun main(args: Array<String>) {
    //алгоритм 1
    println("Введите число:")
    number = readLine()!!
    if (number.toInt() > 7) {
        println("Привет")
    }
    //алгоритм 2
    println("Введите имя:")
    name = readLine()!!
    if (name.equals("Вячеслав")) {
        println("Привет ${name}")
    } else {
        println("Нет такого имени")
    }
    //алгоритм 3
    println("Введите набор чисел (через пробел):")
    serialNumbers = (readLine() as String).split(" ")
    for (i in serialNumbers) {
        if(i.toInt()%3 == 0)
            print("$i ")
    }
}