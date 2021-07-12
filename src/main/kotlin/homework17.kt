// Домашнее задание 17 урока

fun main(){
    //Пункт 1
    println(getMax(10,13))
    println(getMax(4.0, 9.0))
    println(getMax(6,7,8))
    sayHello("Java")
    printInts(1,2,3,4)

    //Пункт 2
//    Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).Сколько денег будет на счету через 3 года (с учётом сложных процентов)?Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
    val percents = deposit(100, 10)
    println(String.format("Total sum for 3 years: %2f", percents))
}

fun getMax(num1:Int, num2: Int) = if(num1 > num2) num1 else num2

fun getMax(num1:Double, num2: Double): Double {
    return if (num1 > num2) num1 else num2
}
fun getMax(num1:Int, num2: Int, num3: Int): Int{
    return when {
        num1 > num2 && num1 > num3 -> num1
        num2 > num2 && num2 > num3 -> num2
        else -> num3
    }
}

fun sayHello(name: String, reps: Int = 1) {
    var counter = reps
    while (counter > 0) {
        println("Hello $name! Where are you?")
        counter--
    }
}

fun printInts(vararg ints: Int){
    for(i in  ints) println(i)
}

fun deposit(initial: Int, percent: Int): Double = (
        initial * Math.pow((1 + percent / 100.0), 3.0))