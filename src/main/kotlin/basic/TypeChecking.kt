package basic

//interface TypeChecking {
//    fun walk() = "$name: walk"
//    fun fly() = "$name: fly"
//}
//
//class HouseFly : TypeChecking
//
//class Flea : Insect {
//    override fun fly() =
//        throw Exception("Flea cannot fly")
//
//    fun crawl() = "Flea: crawl"
//}
//
//fun TypeChecking.basic() =
//    walk() + " " +
//            if (this is Flea)
//                crawl()
//            else
//                fly()
//
//interface SwimmingInsect : TypeChecking {
//    fun swim() = "$name: swim"
//}
//
//interface WaterWalker : TypeChecking {
//    fun walkWater() =
//        "$name: walk on water"
//}
//
//class WaterBeetle : SwimmingInsect
//class WaterStrider : WaterWalker
//class WhirligigBeetle :
//    SwimmingInsect, WaterWalker
//
//fun TypeChecking.water() =
//    when (this) {
//        is SwimmingInsect -> swim()
//        is WaterWalker -> walkWater()
//        else -> "$name: drown"
//    }
//
//fun main() {
//    val insects = listOf(
//        HouseFly(), Flea(), WaterStrider(),
//        WaterBeetle(), WhirligigBeetle()
//    )
//    insects.map { it.basic() }  // =>
//            "[HouseFly: walk HouseFly: fly, " +
//            "Flea: walk Flea: crawl, " +
//            "WaterStrider: walk WaterStrider: fly, " +
//            "WaterBeetle: walk WaterBeetle: fly, " +
//            "WhirligigBeetle: walk " +
//            "WhirligigBeetle: fly]"
//    insects.map { it.water() }  // =>
//            "[HouseFly: drown, Flea: drown, " +
//            "WaterStrider: walk on water, " +
//            "WaterBeetle: swim, " +
//            "WhirligigBeetle: swim]"
//}
//
//interface Shape {
//    fun draw(): String
//}
//
//class Triangle : Shape {
//    override fun draw() = "Triangle: Draw"
//    fun rotate() = "Triangle: Rotate"
//}
//
//fun turn2(s: Shape) = when (s) {
//    is Square -> s.rotate()
//    is Triangle -> s.rotate()
//    else -> ""
//}
//
//fun main() {
//    val shapes =
//        listOf(Circle(), Square(), Triangle())
//    shapes.map { it.draw() }  // => "[Circle: Draw, Square: Draw, Triangle: Draw]"
//    shapes.map { turn(it) }  // => "[, Square: Rotate, ]"
//    shapes.map { turn2(it) }  // => "[, Square: Rotate, Triangle: Rotate]"
//}