// Домашнее задание 7 урока
fun main() {
    val a = 2
    val message = if (a % 2 == 0) {
        "a is even"
    } else if (a % 5 == 0) {
        "a is divsible by 5"
    } else {
        "a isn't even and isn't divsible by 5"
    }
    println(message)

    val b = 5
    val message_when = when{
        b % 2 == 0 -> "b is even"
        b % 5 == 0 -> "b is divsible by 5"
        else -> "b isn't even and isn't divsible by 5"
    }
    println(message_when)
}




