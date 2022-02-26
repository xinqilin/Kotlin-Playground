package collection

fun list() {
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)

    // ======
    val lst = listOf(19.2, 88.3, 22.1)
    lst[1] eq 88.3  // Indexing
    lst.reversed() eq listOf(22.1, 88.3, 19.2)
    lst.sorted() eq listOf(19.2, 22.1, 88.3)
    lst.sum() eq 129.6

    // ===== joinToString
    val list = listOf(1, 2, 3)
    list.toString() eq "[1, 2, 3]"
    list.joinToString() eq "1, 2, 3"
    list.joinToString(
        prefix = "(",
        postfix = ")"
    ) eq "(1, 2, 3)"
    list.joinToString(separator = ":") eq
            "1:2:3"
    // separator, prefix, postfix
    list.joinToString(". ", "", "!") eq
            "1. 2. 3!"
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