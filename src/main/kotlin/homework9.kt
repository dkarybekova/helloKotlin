/* Домашнее задание 9 урока */
import java.math.*
fun main(){
    // Пункт 1
    println("--Пункт 1--")
    val names = arrayListOf("Kotlin", "Java", "Dart")
    for(i in 0 until names.size){
        println(names[i])
    }

    names.forEachIndexed { index, name ->
        println("$index $name")
    }

    for(i in 0..10 step 2){
        println(i)
    }

    for(i in 10 downTo 0){
        println(i)
    }

    for(i in 0..10){
        if(i == 6) break
        println(i)
    }
    var j = 0
    while (j <= 10){
        println("while $j")
        j++
    }

    var k = 11
    do{
        println("do while $k")
        k++
    }while (k<=10)

    // Пункт 2
    // Необходимо написать программу, которая бы вывела в консоль квадрат и треугольник из звездочек вот таким образом, как на картинке ниже.
    println("--Пункт 2--")
    var star = 5
    for(a in 0 until star){
        for(b in 0 until star){
            print("*  ")
        }
        println("")
    }

    var c = 0
    while (c <= star) {
        for (d in 0 until star - c) {
            print("  ")
        }
        for (d in 0 until c) {
            print(" *")
        }
        println()
        c++
    }
    // Дополнительное задание
    println("Дополнительное задание 1")
    // Найти количество цифр в заданном числе n., например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр. Использовать операции со строками в этой задаче запрещается.
    println("Enter any number")
    var counter = 0
    var number: Int=Integer.valueOf(readLine())
    while(number > 0) {
        if (number % 10 != 0) {
            counter++
        }
        number /= 10
    }
    println("This is a $counter digit number")
    println("Дополнительное задание 2")
    // Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
    var degree: Int = 1
    val num: Int = 2
    var result = 1
    do{
        result = result * num
        println(result)
        degree++
    }while(degree <= 20)
}




