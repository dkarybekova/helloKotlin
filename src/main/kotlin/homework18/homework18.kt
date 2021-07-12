package homework18
// Домашнее задание 18 урока
fun main(){
    println("Пункт 1")
    val person = Person("Dinara", "Karybekova", 37)
    println(person.name)
    println(person.surName)
    println(person.age)
    person.introduceYourSelf()
    val employee = Employee("Elon", "Mask", 40, 20)
    println(employee.introduceYourSelf())

    println()
    println("Пункт 2")
    val cat = Cat("Pushok", "black")
    cat.introduceYourCat()
    val food = Food("Tomyam")
    food.favouriteFood()
    val paper = Paper("black", "A2")
    paper.whatPaper()
    val boiler = Boiler(80, 15000)
    boiler.boilerDescription()
    val battery = Battery("Duracell")
    battery.batteryDescribe()
    val liquid = Liquid("white", "sweet")
    liquid.liquid()
    val cup = Cup("blue", "Tom")
    cup.whoseCup()
    println(cup.owner)
    val box = Box("big", "plastic")
    box.boxDescribe()
    val student = Student("Dinara", "Karybekova", "Android/Kotlin")
    student.studentGroup()
    val worker = Worker("Tom", "Soyer","part-time")
    worker.workerStatus()

    println()
    println("Пункт 3")
    val cat2 = Cat2("Barsik", 7, "full", 2)
    cat2.catDescription()
    val changes = Change("Barsik", 7, "full",2, "hungry", 10)
    println(changes.catDescription())
}

open class Person(val name: String, val surName:String, val age: Int){
    open fun introduceYourSelf(){
        println("My name is $name, i love programming")
    }
}

class Employee(name:String, surName:String, age:Int, val experience:Int): Person(name, surName, age){
    override fun introduceYourSelf() {
        println("My name is $name $surName, I have $experience years of experience!")   //свою функцию создали
    }
}

//Пункт 2
// Опишите в виде классов следующие предметы: Кот, Еда, Бумага, Бойлер
//(для воды), Батарейка, Жидкость, Кружка, Коробка, Студент, СотрудникКомпании;
class Cat(val name:String, val color:String){
    open fun introduceYourCat() {
        println("My cat's name is $name. He is $color")
    }
}

class Food(val name:String){
    open fun favouriteFood() {
        println("My favourite food is $name")
    }
}

class Paper(val color: String, val size:String){
    open fun whatPaper(){
        println("This paper is $color, size - $size")
    }
}

class Boiler(val capacity:Int, val price:Int){
    open fun boilerDescription(){
        println("This boiler's capacity is $capacity. The price is $price")
    }
}

class Battery(val manufacturer: String){
    open fun batteryDescribe(){
        println("This battery's manufacturer is $manufacturer.")
    }
}

class Liquid(val color: String, val taste: String){
    open fun liquid(){
        println("This liquid is $color and $taste")
    }
}

class Cup(val color:String, val owner:String){
    open fun whoseCup(){
        println("Who is the owner of this $color cup?")
    }
}

class Box(val size: String, val material: String){
    open fun boxDescribe(){
        println("This $size box made of $material")
    }
}
class Student(val name:String, val lastname:String, val group:String){
    open fun studentGroup(){
        println("$name $lastname is in group $group")
    }
}
class Worker(val name: String, val lastname:String, val status:String){
    open fun workerStatus(){
        println("$name $lastname is $status worker")
    }
}

//Пункт 3
// Создайте класс Кот со следующими полями: имя, возраст, уровень сытости,
//уровень воды. И реализуйте в нем следующие методы: 1) вывод имени, возраста,
//начального уровня сытости и уровня воды, 2) метод, меняющий параметры
//сытости и воды и дальнейший их вывод;

open class Cat2(val name: String, val age:Int, val satietyLevel:String, val waterLevel: Int){
    open fun catDescription(){
        println("This cat`s name is $name, age- $age, satiety level - $satietyLevel and water level- $waterLevel.")
    }
}
class Change(name:String, age:Int, satietyLevel:String, waterLevel:Int, val newSatietyLevel:String, val newWaterLevel:Int): Cat2(name, age, satietyLevel, waterLevel){
    override fun catDescription() {
        println("Satiety level changed to $newSatietyLevel, and water level to $newWaterLevel for cat - $name.")
    }
}