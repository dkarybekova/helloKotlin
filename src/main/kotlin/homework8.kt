// Домашнее задание 8 урока
fun main(){
    // Пункт 1
    println("--Пункт 1--")
    val myArray = arrayOf(1,2,3,4,5)
    println(myArray[0])
    println(myArray[1])

    val myArrayList = ArrayList<String>()
    myArrayList.add("Kotlin")
    myArrayList.add("Java")
    myArrayList.add("Dart")

    myArrayList.add(index = 1, element = "Python")
    myArrayList.remove(element = "Java")
    println(myArrayList)
    println(myArrayList.size)

    // Пункт 2
    println("--Пункт 2--")
    //    Дан массив чисел [1, 2, 3] и второй массив чисел [4, 5, 6] найти сумму элементов двух массивов
    val array1 = arrayOf(1,2,3)
    val array2 = arrayOf(4,5,6)
    val array3 = array1 + array2
    println(array3)

    // Дополнительное задание
    println("Дополнительное задание 1")
    // Дан массив чисел “5, -3, 15, 61, 29, 10, -2 ,7” найти наибольший элемент в этом массиве.
    val dopList = arrayOf(5,-3,15,61,29,10,-2.7)
    var maxNumber = dopList[0].toFloat()

    for (number in dopList){
        if(maxNumber < number.toFloat())
            maxNumber = number.toFloat()
    }
    println(maxNumber)
}

