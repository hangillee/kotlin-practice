class HelloWorld {
    fun print(args: String) {
        val name = if (args.isNotEmpty()) args[0] else "Kotlin"
        println("Hello! $name!")
    }
}