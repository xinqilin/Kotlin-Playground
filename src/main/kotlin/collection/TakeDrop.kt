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

    println(fruits)

    println(fruits.take(2))
    //[Fruit(name=apple, sugar=1), Fruit(name=lemon, sugar=1)]
    println(fruits.takeLast(3))
    //[Fruit(name=banana, sugar=10), Fruit(name=peach, sugar=20), Fruit(name=mango, sugar=20)]
    println(fruits.takeWhile { it.sugar > 8 })
    //[]
    println(fruits.takeLastWhile { it.sugar > 5 })
    //[Fruit(name=guava, sugar=8), Fruit(name=banana, sugar=10), Fruit(name=peach, sugar=20), Fruit(name=mango, sugar=20)]
    println(fruits.takeIf { true })
    //[Fruit(name=apple, sugar=1), Fruit(name=lemon, sugar=1), Fruit(name=orange, sugar=3), Fruit(name=pineapple, sugar=5), Fruit(name=guava, sugar=8), Fruit(name=banana, sugar=10), Fruit(name=peach, sugar=20), Fruit(name=mango, sugar=20)]
    println(fruits.takeUnless { true })
//    null

    println(fruits.drop(2))
//    [Fruit(name=orange, sugar=3), Fruit(name=pineapple, sugar=5), Fruit(name=guava, sugar=8), Fruit(name=banana, sugar=10), Fruit(name=peach, sugar=20), Fruit(name=mango, sugar=20)]
    println(fruits.dropLast(3))
//    [Fruit(name=apple, sugar=1), Fruit(name=lemon, sugar=1), Fruit(name=orange, sugar=3), Fruit(name=pineapple, sugar=5), Fruit(name=guava, sugar=8)]


}

