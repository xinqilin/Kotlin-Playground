package basic

data class Tag(var n: Int = 0) {
    var s: String = ""
    fun increment() = ++n
}

fun main() {
    // let(): Access object with 'it'
    // Returns last expression in lambda
    Tag(1).let {
        it.s = "let: ${it.n}"
        it.increment()
    }  // => 2

    // let() with named lambda argument:
    Tag(2).let { tag ->
        tag.s = "let: ${tag.n}"
        tag.increment()
    }  // => 3

    // run(): Access object with 'this'
    // Returns last expression in lambda
    Tag(3).run {
        s = "run: $n" // Implicit 'this'
        increment()   // Implicit 'this'
    }  // => 4

    // with(): Access object with 'this'
    // Returns last expression in lambda
    with(Tag(4)) {
        s = "with: $n"
        increment()
    }  // => 5

    // apply(): Access object with 'this'
    // Returns modified object
    Tag(5).apply {
        s = "apply: $n"
        increment()
    }  // => "Tag(n=6)"

    // also(): Access object with 'it'
    // Returns modified object
    Tag(6).also {
        it.s = "also: ${it.n}"
        it.increment()
    }  // => "Tag(n=7)"

    // also() with named lambda argument:
    Tag(7).also { tag ->
        tag.s = "also: ${tag.n}"
        tag.increment()
    }  // => "Tag(n=8)"
}