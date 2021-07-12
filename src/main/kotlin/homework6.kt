import java.util.Scanner
import kotlin.math.sqrt
import kotlin.reflect.typeOf

// Домашнее задание 6 урока
fun main(){
    // Пункт 1
    println("--Пункт 1--")
    val score = -5
    when (score) {
        in 90..100 -> println("5")
        in 70..89 -> println("4")
        in 50..69 -> println("3")
        in 30..49 -> println("2")
        in 0..29 -> println("1")
        else -> println("Invalid score")
    }

    when{
        3>2 -> println("3>2")
        "string".length == 6 -> println("length is 6")
        2<3 -> println("2<3")
        else ->{
            println("else called")
        }
    }
    val a = 5
    val b = 3
    val maxValue = when (a > b) {
        true -> a
        false -> b
    }
    println( "max value is $maxValue" )

    // Пункт 2
    println("--Пункт 2--")
    //    Дан номер месяца (от 1 до 12 включительно). Вернуть число дней в этом месяце по календарю. Сделать используя оператор when.
    val month = readLine()?.toInt()
    when(month){
        1,3,5,7,8,10,12 -> println("Месяц $month - дней 31")
        4,6,9,11 -> println("Месяц $month - дней 30")
        2 -> println("Месяц $month - дней 28 or 29")
        else -> println("Ввод неправильный")
    }

    // Дополнительное задание
    println("Дополнительное задание 1")
//    Вводятся координаты (x;y) точки и радиус круга (r). Определить принадлежит ли данная точка кругу, если его центр находится в начале координат. Сделать используя оператор when.
    println("Enter x, y and radius of circle")
    val x = readLine()?.toInt() ?:0
    val y = readLine()?.toInt() ?:0
    val r = readLine()?.toInt() ?:0
    when{
        x <= r && y <= r || x<=-r && y<=-r -> println("Yes, your dot is in the circle")
        else -> println("No, your dot isn't in the circle")
    }
}


