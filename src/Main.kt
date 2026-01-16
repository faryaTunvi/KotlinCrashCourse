
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

   var p = 11
   p++
   var q = 9
   q--
   println("Addition of p, q is ${p+q}")
   println("Increment of p = $p")
   println("Decrement of q = $q")

   p += 5
   q -= 5
   println("Subtraction of p, q is ${p-q}")
   println("Increment of p = $p")
   println("Decrement of q = $q")

   //Comparison Operators
   val r = 11
   val o = 9
   println("Value of r is $r")
   println("Value of o is $o")

   val areNumbersTheSame = r == o

   println("Equal to operator check for r and o is ${areNumbersTheSame}")
   println("r % 2 Equal to 0 is ${r % 2 == 0}")
   println("Greater than operator check for r and o is ${r > o}")
   println("Less than operator check for r and o is ${r < o}")
   println("Greater than or equal to operator check for r and o is ${r >= o}")
   println("Less than or equal to operator check for r and o is ${r <= o}")
   println("Not equal to operator check for r and o is ${r != o}")

   // Logical Operators
   val areBothEven = r % 2 == 0 && o % 2 == 0
   val areOneOfThenEven = r % 2 == 0 || o % 2 == 0
   val areBothNotEven = r % 2 == 0 && !(o % 2 == 0)

   println("Is r and o both even number? ${areBothEven}") // Logical AND: true && true → true
   println("Is r and o one of them even number? ${areOneOfThenEven}") // Logical OR: false || true → true
   println("Is r and o not both even number? ${areBothNotEven}") // Logical Not:  ! → true

   // Null safety operator 🔹🔹🔹 New in Kotlin
   // ?: → Elvis Operator
   // ?. → Safe Call Operator
   // !! → non-null assertion operator 🔹 The operator removes the null restriction from a variable. 🔹 But if that variable is null, your program crashes.

   println("Please enter a number: ")
   val input = readln()
   val inputAsInteger = input.toIntOrNull() ?: 0 // assign default value
   val inputAsIntegerWithIncrement = input.toIntOrNull()?.inc() // incremental value
   val inputAsIntegerWithMod = input.toIntOrNull()?.rem(2) == 0 // mod check
   val inputAsIntegerWithModEqualCheck = input.toIntOrNull()?.rem(2)?.equals(0) // mod check
   val isNotNull = input.toIntOrNull()?.equals(0)!!
   val name: String? = "Farya"

   println("Your input is: $inputAsInteger")
   println("Your input incremental is: $inputAsIntegerWithIncrement")
   println("Is Even: $inputAsIntegerWithMod")
   println("Is Even: $inputAsIntegerWithModEqualCheck")
   println("Is the number NotNull? $isNotNull")
   println(" Farya string length is ${name!!.length}")  // Works fine

   val inputInteger = input.toIntOrNull()
   val isEven = inputInteger // https://www.youtube.com/watch?v=dzUc9vrsldM 47 minuts
   println("Is the number even? $isEven")






}