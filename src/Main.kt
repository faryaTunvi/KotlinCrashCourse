
fun main() {

   //Primitive data type in Kotlin
   val x:Int = 5
   println("Int = $x")  // Int → 4 bytes (32 bits)

   val y:Float = 5f
   println("Float = $y")   // Float → 4 bytes (32 bits)

   val z: Double = 5.123
   println("Double = $z")  // Double → 8 bytes (64 bits)

   val a: Boolean = false
   println("Boolean = $a") // Boolean → 1 bit (theoretically) but 1 byte in memory representation

   val b: String = "Hello World"
   println("String = $b")   // String → depends on text length (each Char = 2 bytes)

   var s = "Hello world"
   s = "Bye!"
   println("Variable = $s")

   //Arithmetic Operators in Kotlin
   val m = 11
   val n = 9

   println("Addition m + n = ${m + n}")
   println("Subtraction m - n = ${m - n}")
   println("Multiplication m * n = ${m * n}")
   println("Division m / n = ${m / n}")
   println("Modulus m % n = ${m % n}")


}