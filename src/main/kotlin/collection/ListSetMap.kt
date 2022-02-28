package collection

fun list() {
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)

    // ======
    val lst = listOf(19.2, 88.3, 22.1)
    lst[1]  // => 88.3  // Indexing
    lst.reversed()  // => listOf(22.1, 88.3, 19.2)
    lst.sorted()  // => listOf(19.2, 22.1, 88.3)
    lst.sum()  // => 129.6

    // ===== joinToString
    val list2 = listOf(1, 2, 3)
    list2.toString()  // => "[1, 2, 3]"
    list2.joinToString()  // => "1, 2, 3"
    list2.joinToString(
        prefix = "(",
        postfix = ")"
    )  // => "(1, 2, 3)"
    list2.joinToString(separator = ":")  // =>
            "1:2:3"
    // separator, prefix, postfix
    list2.joinToString(". ", "", "!")  // =>
            "1. 2. 3!"

    val list3 = listOf('a', 'b', 'c')
    list3.mapIndexed { index, element ->
        "[$index: $element]"
    }  // => listOf("[0: a]", "[1: b]", "[2: c]")

    val list4 = listOf('a', 'b', 'c')
    list4.indices.map {
        "[$it]"
    }  // => listOf("[0]", "[1]", "[2]")
}

fun advanceList(){
    // The lambda argument is the element index:
    val list1 = List(10) { it }
    list1  // => "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"

    // A list of a single value:
    val list2 = List(10) { 0 }
    list2  // => "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]"

    // A list of letters:
    val list3 = List(10) { 'a' + it }
    list3  // => "[a, b, c, d, e, f, g, h, i, j]"

    // Cycle through a s // =>uence:
    val list4 = List(10) { list3[it % 3] }
    list4  // => "[a, b, c, a, b, c, a, b, c, a]"

    // ============
    val mutableList1 =
        MutableList(5, { 10 * (it + 1) })
    mutableList1  // => "[10, 20, 30, 40, 50]"
    val mutableList2 =
        MutableList(5) { 10 * (it + 1) }
    mutableList2  // => "[10, 20, 30, 40, 50]"

    //===========

    val list = listOf(-3, -1, 5, 7, 10)

    list.filter { it > 0 }  // => listOf(5, 7, 10)
    list.count { it > 0 }  // => 3

    list.find { it > 0 }  // => 5
    list.firstOrNull { it > 0 }  // => 5
    list.lastOrNull { it < 0 }  // => -1

    list.any { it > 0 }  // => true
    list.any { it != 0 }  // => true

    list.all { it > 0 }  // => false
    list.all { it != 0 }  // => true

    list.none { it > 0 }  // => false
    list.none { it == 0 }  // => true
}

fun advancePlusList(){
    val list = listOf(-3, -1, 5, 7, 10)
    val isPositive = { i: Int -> i > 0 }

    list.filter(isPositive)  // => "[5, 7, 10]"
    list.filterNot(isPositive)  // => "[-3, -1]"

    val (pos, neg) = list.partition { it > 0 }
    pos  // => "[5, 7, 10]"
    neg  // => "[-3, -1]"
}

fun sortList(){
    data class Product(
        val description: String,
        val price: Double
    )

    fun main() {
        val products = listOf(
            Product("bread", 2.0),
            Product("wine", 5.0)
        )
        products.sumOf { it.price }  // => 7.0

        products.sortedByDescending { it.price }  // =>
                "[Product(description=wine, price=5.0)," +
                " Product(description=bread, price=2.0)]"
        products.minByOrNull { it.price }  // =>
                Product("bread", 2.0)
    }
}

fun takeOrDrop(){
    val list = listOf('a', 'b', 'c', 'X', 'Z')
    list.takeLast(3)  // => "[c, X, Z]"
    list.takeLastWhile { it.isUpperCase() }  // =>
            "[X, Z]"
    list.drop(1)  // => "[b, c, X, Z]"
    list.dropWhile { it.isLowerCase() }  // =>
            "[X, Z]"
}

fun set() {
    val intSet = setOf(1, 1, 2, 3, 9, 9, 4)

    intSet.union(setOf(3, 4, 5, 6)) // => setOf(1, 2, 3, 4, 5, 6, 9)

    // Set intersection:
    intSet intersect setOf(0, 1, 2, 7, 8) // => setOf(1, 2)

    // Set difference:
    intSet subtract setOf(0, 1, 9, 10) // =>setOf(2, 3, 4)
    intSet - setOf(0, 1, 9, 10) // =>  setOf(2, 3, 4)

    //=========== list to set
    val list = listOf(3, 3, 2, 1, 2)
    list.toSet() // => setOf(1, 2, 3)
    list.distinct() // => listOf(3, 2, 1)

    //========== add remove
    val mutableSet = mutableSetOf<Int>()
    mutableSet += 42
    mutableSet += 42
    mutableSet // =>  setOf(42)
    mutableSet -= 42
    mutableSet // => setOf<Int>()
}

fun advanceSet(){
    val set = setOf("a", "ab", "ac")
    set.maxByOrNull { it.length }?.length  // => 2
    set.filter {
        it.contains('b')
    }  // => listOf("ab")
    set.map { it.length }  // => listOf(1, 2, 2)
}

fun map() {

    val m = mutableMapOf(5 to "five", 6 to "six")
    m[5] // => "five"
    m[5] = "5ive"
    m[5] // => "5ive"
    m += 4 to "four"
    m // => mapOf(5 to "5ive", 4 to "four", 6 to "six")
}

fun zip(){
    val left = listOf("a", "b", "c", "d")
    val right = listOf("q", "r", "s", "t")

    left.zip(right)  // => "[(a, q), (b, r), (c, s), (d, t)]"
}

fun flatten(){
    val list = listOf(
        listOf(1, 2),
        listOf(4, 5),
        listOf(7, 8),
    )
    list.flatten()  // => "[1, 2, 4, 5, 7, 8]"
}