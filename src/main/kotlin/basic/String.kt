import sun.util.locale.LocaleUtils.isEmpty

fun main() {
    val s1: String? = null
    s1.isNullOrEmpty()  // => true
    s1.isNullOrBlank()  // => true

    val s2 = ""
    s2.isNullOrEmpty()  // => true
    s2.isNullOrBlank()  // => true

    val s3: String = " \t\n"
    s3.isNullOrEmpty()  // => false
    s3.isNullOrBlank()  // => true

}

fun extension() {
    fun String?.isNullOrEmpty(): Boolean =
        this == null || isEmpty()

    "".isNullOrEmpty()  // => true
}