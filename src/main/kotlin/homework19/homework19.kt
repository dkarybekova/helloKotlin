package homework19
// Домашнее задание 19 урока

fun main(){
    println("Пункт 2")
    val cat = Cat("Pushok", "black")
    println(cat.toString() + " " +"Hash code = ${cat.hashCode()}")

    val food = Food("Tomyam")
    println(food.toString() + " " +"Hash code = ${food.hashCode()}")

    val paper = Paper("black", "A2")
    println(paper.toString() + " " +"Hash code = ${paper.hashCode()}")

    val boiler = Boiler(80, 15000)
    println(boiler.toString() + " " +"Hash code = ${boiler.hashCode()}")

    val battery = Battery("Duracell")
    println(battery.toString() + " " +"Hash code = ${battery.hashCode()}")

    val liquid = Liquid("white", "sweet")
    println(liquid.toString() + " " +"Hash code = ${liquid.hashCode()}")

    val cup = Cup("blue", "Tom")
    println(cup.toString() + " " +"Hash code = ${cup.hashCode()}")

    val box = Box("big", "plastic")
    println(box.toString() + " " +"Hash code = ${box.hashCode()}")

    val student = Student("Dinara", "Karybekova", "Android/Kotlin")
    println(student.toString() + " " +"Hash code = ${student.hashCode()}")

    val worker = Worker("Tom", "Soyer","part-time")
    println(worker.toString() + " " +"Hash code = ${worker.hashCode()}")

    println()
    println("Пункт 3")
    val book_1 = Book("Атлант расправил плечи1", "Айн Рэнд", 1957)
    println(book_1.toString())
    val book_2 = book_1.copy(name = "Гимн", year = 1938)
    println(book_2.toString())
    val book_4 = book_1.copy(name = "Атлант расправил плечи том2")
    println(book_4.toString())
    val book_5 = book_1.copy(name = "Атлант расправил плечи том3")
    println(book_5.toString())
}

data class Cat(
    val name:String,
    val color:String) {}

data class Food(
    val name:String){}

data class Paper(
    val color: String,
    val size:String){}

data class Boiler(
    val capacity:Int,
    val price: Int){}

data class Battery(
    val manufacturer: String){}

data class Liquid(
    val color: String,
    val taste: String){}

data class Cup(
    val color:String,
    val owner:String){}

data class Box(
    val size: String,
    val material: String){}

data class Student(
    val name:String,
    val lastname:String,
    val group:String){}

data class Worker(
    val name: String,
    val lastname: String,
    val size: String){}

data class Book(
    val name:String,
    val author:String,
    val year:Int){
}