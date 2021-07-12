var myMap: HashMap<String, String>? = null
fun main() {
    val names = arrayOf("KG", "RU", "USA", "TR")
    val codes = arrayOf("+996", "+7", "+1", "+98")

    var myMap = mutableMapOf<String, String>()
        .apply { for (name in names.indices) this[names[name]] = codes[name] }
    println("Countries with codes - $myMap")
}