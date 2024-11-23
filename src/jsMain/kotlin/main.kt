fun main(args: Array<String>) {
    val (short, long) = args
        .asSequence()
        .drop(2) // drop [node, <script name>]
        .partition { it.length <= 1 }

    println("Short arguments: ${short.joinToString(", ")}")
    println("Long arguments: ${long.joinToString(", ")}")
}