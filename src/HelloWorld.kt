// HelloWorld.kt
/**
 * CSE 310 - Module 1: Hello World
 * Author: Gerard Vigo Rodrigues
 *
 * This is my first Kotlin program for CSE 310.
 * It demonstrates basic Kotlin syntax and console output.
 */

fun main() {
    // Print header with decorative border
    printBorder()

    // Main greeting
    println("🌍 HELLO WORLD! 🌍")
    printBorder()
    println()

    // Personal introduction
    println("👋 About Me:")
    println("   Name: Gerard Vigo Rodrigues")
    println("   University: Brigham Young University-Idaho")
    println("   Program: Software Development")
    println("   Location: Lima, Peru")
    println()

    // Technologies I'm learning
    println("💻 Technologies I'm Learning:")
    val technologies = listOf(
        "Kotlin",
        "Python",
        "JavaScript",
        "React",
        "C#",
        "MySQL"
    )

    technologies.forEachIndexed { index, tech ->
        println("   ${index + 1}. $tech")
    }
    println()

    // Fun fact
    println("✨ Fun Fact:")
    println("   This is my first Kotlin program!")
    println("   I'm excited to learn more about software development.")
    println()

    // Closing message
    printBorder()
    println("🚀 Let's build something amazing! 🚀")
    printBorder()
}

/**
 * Helper function to print a decorative border
 */
fun printBorder() {
    println("=" * 50)
}

/**
 * Extension function to repeat strings (like Python's * operator)
 */
operator fun String.times(n: Int): String = this.repeat(n)