fun main() {
    val s1: String? = null
    s1.isNullOrEmpty()  // => true
    s1.isNullOrBlank()  // => true

    val s2 = ""
    s2.isEmpty()  // => true
    s2.isBlank()  // => true

    val s3: String = " \t\n"
    s3.isEmpty()  // => false
    s3.isBlank()  // => true

}

fun extension() {
    fun String?.isNullOrEmpty(): Boolean =
        this == null || isEmpty()

    "".isNullOrEmpty()  // => true
}