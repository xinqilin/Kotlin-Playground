package collection

/**
 * @author Bill.Lin on 2021/10/24
 */

fun main() {
//    參考 kotlin.tips
//    在處理多個 List 時，可以用像是 union、intersect、subtract
//    等操作來快速地解決您想要完成的任務而不用依賴 filter。這些都是在 Sets、Lists
//    等集合裡的 Extension 或 infix functions。

    val ticketHandlers: List<String> = listOf("meggie","mary","alex")
    val speakers: List<String> = listOf("mary","andy","bill")
    val volunteers: List<String> = listOf("cat","mat","mary")

    println("Guest: ${speakers union ticketHandlers}")
    //    Guest: [mary, andy, bill, meggie, alex]
    println("MVPs: ${speakers intersect ticketHandlers intersect volunteers}")
    //    MVPs: [mary]
    println("Helpers: ${volunteers subtract speakers}")
    //    Helpers: [cat, mat]
}