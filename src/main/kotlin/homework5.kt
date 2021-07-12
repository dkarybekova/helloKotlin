// Домашнее задание 5 урока
fun main() {
    // Пункт 1
    println("--Пункт 1--")
    val score = -5

    if (score >= 90 && score <= 100) {
        println("5")
    } else if (score >= 70 && score <= 90) {
        println("4")
    } else if (score >= 50 && score <= 70) {
        println("3")
    } else if (score >= 30 && score <= 50) {
        println("2")
    } else if (score >= 0 && score <= 30) {
        println("1")
    } else {
        println("Invalid score")
    }

    val a = 5
    val b = 3
    val maxValue = if (a > b) {
        println("a is bigger")
        a
    } else
        b
    println("max value is $maxValue")

    // Домашнее задание 2
    println("Введите четырехзначное число")
    var happyNumber = readLine()
    var numbers = happyNumber.toString().split("").drop(1)

    if (numbers[0].toInt() + numbers[1].toInt() == numbers[2].toInt() + numbers[3].toInt()) {
        println(true)
    } else {
        println(false)
    }

    // Дополнительное задание 1
    println("Enter your age")
    val age = readLine()?.toInt() ?: 0
    if (age >= 1 && age <= 200) {
        println("You are $age year(s) old")
    } else {
        println("You entered wrong number")
    }
}