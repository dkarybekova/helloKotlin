//Домашнее задание 10 урока
fun main(){
    //Пункт 1
    println("--Пункт 1--")
    val password = "12345"
    val username = "onepunchman_01"
    val name = "John"

    val myMap = HashMap<String,String>()

    myMap.put("password", "12345")
    myMap.put("username", "onepunchman_01")
    myMap.put("name", "John")
    myMap.put("name2","John")
    myMap.put("name3", "John")

    println(myMap.entries)
    println(myMap.get("password"))

    val mySet = HashSet<Int>()

    val list = arrayListOf(1,2,3,4,4,4,4,1,1)
    mySet.addAll(list)
    println(mySet)

    //Пункт 2
    // Для заданного списка покупок ''shoppingList'' посчитать его общую стоимость на основе цен из ''itemCosts'' операцию вычисления общей стоимости выполнить через цикл. В случае неизвестной цены считать, что товар игнорируется. (Добавить в ‘’itemCosts’’ два товара и цены и в  ''shoppingList'')
    println("--Пункт 2--")
    var sum = 0.0
    val itemCosts = mapOf("Хлеб" to 50.0, "Молоко" to 40.0,"Сыр" to 280.0, "Картошка" to 20.0)
    val shoppingList = listOf("Хлеб", "Сыр")
    for(good in itemCosts){
        if (good.key in shoppingList){
            sum += good.value
        }
    }
    println("Стоимость покупки $sum")
}

