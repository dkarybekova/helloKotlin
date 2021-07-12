fun main() {
    val array = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2, -1, 3)
    println("Unsorted " + array.contentToString())
    val length = array.size
    var temp = 0
    for (i in 0 until length) {
        for (x in 1 until length) {
            if (array[x - 1] > array[x]) {
                temp = array[x - 1]
                array[x-1] = array[x]
                array[x] = temp
            }
        }
    }
    println("Sorted " + array.contentToString())
}