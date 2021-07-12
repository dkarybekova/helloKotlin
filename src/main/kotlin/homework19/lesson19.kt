package homework19

fun main(){
    println("Пункт 1")
    val person1 = Employee("Nurdan", "Momun", 21, 2)
    val person2 = Employee("Nurdan", "Momun", 21, 2)
    val person3 = person1.copy(lastname = "Duishenov")

    println(person1.toString())
    println(person1 == person2)
    println(person1 == person3)
    println("person3: $person3")
}
data class Employee(
    val name:String,
    val lastname:String,
    val age:Int,
    val experience:Int){
}