package basic

//object初始化時做一些事，則在object裡面加上一個init區塊。 init 只執行一次
// ex: Class1.ppp() , Class1.ppp() ===>  init, ppp, ppp

object Class1{
    init {
        println("init")
    }
    fun ppp(){
        println("ppp")
    }
}

// 需告的物件不是singleton companion object

class Class2 {
    companion object {
        val instance = Class2()
    }
    fun hello(){
        println("hello")
    }
}

//Nested Class (巢狀類別)
class Class3 {
    private val name: String = "name333"
    class Class4 {
        val name: String = "name4444"
    }
}
fun main() {
    println(Class3.Class4().name)
}

//Inner Class (內部類別)
class Class5 {
    private val name: String = "name555"
    inner class Class6 {
        val name2: String = name
    }
}

// DataClass
// copy 是 copy value 不是 reference