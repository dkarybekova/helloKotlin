import java.util.Scanner
import kotlin.math.sqrt
import kotlin.reflect.typeOf
// Домашнее задание 4 урока
fun main(){
    // Пункт 1
    println("--Пункт 1--")
    var a = 10
    var b = 3
    println("-a = ${-a}")
    println("a++ : ${a++}")
    println("++a : ${++a}")
    println("a-- : ${a--}")
    println("--a : ${--a}")
    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")
    println("2+2*5 = ${(2+2)*5}")
    a+=2
    println("a += 2: $a")
    a-=2
    println("a -= 2: $a")
    a*=2
    println("a *= 2: $a")
    a/=2
    println("a /= 2: $a")
    a%=2
    println("a %= 2: $a")

    // Пункт 2
    println("--Пункт 2--")
//    Напишите программу для решения квадратного уравнения. Квадратное уравнение - это уравнение вида ax2 + bx + c = 0; Учтите, что входные данные и результат могут быть с десятичной частью.
    val reader = Scanner(System.`in`)
    println("ax^2 + bx + c = 0")
    print("Введите a,b и c")
    var c = reader.nextFloat()
    var d = reader.nextFloat()
    var e = reader.nextFloat()
    var discriminant:  Float = (d*d-4*c*e)
    println(discriminant)
    var x1 = (-d- sqrt(discriminant))/2*c
    var x2 = (-d+ sqrt(discriminant))/2*c
    println("Корни уравнения: x1 = $x1, x2 = $x2")

// Дополнительное задание
    println("Дополнительное задание 1")
//    Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).Определите время поезда в пути в минутах (в данном случае 216).
    print("Enter departure time - ")
    var departure = readLine()
    print("Enter arrival time - ")
    var arrival = readLine()
    var departuresplit = departure.toString().split(":")
    var arrivalsplit = arrival.toString().split(":")
    var result = (arrivalsplit[0].toInt()*60 + arrivalsplit[1].toInt())-(departuresplit[0].toInt()*60 + departuresplit[1].toInt())
    println("Trip time is $result min")

// Дополнительное задание 2
    println("Дополнительное задание 2")
//    Пользователь вводит два числа. Одно присваивается одной переменной, а второе - другой. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.
    println("Enter two different numbers: ")
    var number1 = readLine()?.toInt()
    var number2 = readLine()?.toInt()
    number1 = number2.also { number2 = number1 }
    println(number1)
    println(number2)
}
