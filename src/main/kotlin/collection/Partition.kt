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

    val (sweet, superSweet) = fruits.partition { it.sugar < 10 }
    println(sweet)
//    [Fruit(name=apple, sugar=1), Fruit(name=lemon, sugar=1), Fruit(name=orange, sugar=3), Fruit(name=pineapple, sugar=5), Fruit(name=guava, sugar=8)]
    println(superSweet)
//    [Fruit(name=banana, sugar=10), Fruit(name=peach, sugar=20), Fruit(name=mango, sugar=20)]
}



