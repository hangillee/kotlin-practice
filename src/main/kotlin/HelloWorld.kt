class HelloWorld {
    fun print(args: String) {
        val name = args.ifEmpty { "Kotlin" }
        println("Hello! $name!")
    }
}