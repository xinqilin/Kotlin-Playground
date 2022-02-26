package collection

fun list() {
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)
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

fun map() {

    val m = mutableMapOf(5 to "five", 6 to "six")
    m[5] // => "five"
    m[5] = "5ive"
    m[5] // => "5ive"
    m += 4 to "four"
    m // => mapOf(5 to "5ive", 4 to "four", 6 to "six")
}