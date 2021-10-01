package collection

/**
 * @author Bill.Lin on 2021/10/1
 */

fun main() {
    data class Fruit(val name: String, val sugar: Int)

    val fruits = listOf<Fruit>(
            Fruit("banana", 10),
            Fruit("apple", 1),
            Fruit("orange", 3),
            Fruit("pineapple", 5),
            Fruit("guava", 8),
            Fruit("peach", 20),
            Fruit("lemon", 1),
            Fruit("mango", 20),
    ).sortedBy(Fruit::sugar)

    val result = fruits.reversed().joinToString(
            separator = " + ",
            prefix = "[",
            postfix = "]",
            limit = 3,
            truncated = "More..",
//            transform = Fruit::name  //跟 {it.name}  同效果
    ) { it.name }

    println(result)
    //[mango + peach + banana + More..]
}

