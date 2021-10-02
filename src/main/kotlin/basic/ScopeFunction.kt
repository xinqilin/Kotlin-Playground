package basic

/**
 * @author Bill.Lin on 2021/10/2
 */
fun main() {

    // === let ===

    listOf(1, 2, 3).let { println(it) }
    // let() 很常用在判斷某變數不是 null 才往下執行
    var name = null
    name?.let { println("is null") }

    // === run ===
    // run() 使用 this access inner variable

    // === with ===
    // with() 函數的內文物件放在 () 裡面,傳輸到 {}  執行過後 回傳執行後的結果。
    // 使用 this access inner variable
    data class Fruit(var name: String, var sugar: Int = 0)

    val fruit = Fruit(name = "Mongo")
    with(fruit) { println(name) }

    // === apply ===
    //    apply() access inner this  and return object itself
    val t = Fruit(name = "Orange")
    t.apply {
        sugar = 1
    }

    // === also ===
    //    also() access it this  and return object itself

    var list = mutableListOf(1, 2)
    list.add(3)
    list.remove(1)
    list = list.map { it * 10 }.toMutableList()
    println(list) // [20, 30]

    mutableListOf(1, 2).apply {
        add(3)
        remove(1)
    }.map { it * 10 }.also { println(it) }

    var a = 1
    var b = 2
    a = b.also { b = a }
    println("$a, $b") // 2, 1
}