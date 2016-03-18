1+2

// Calling past variable outputs does not work in Worksheets
//res0 *3

println("Hello, world!")

val msg = "Hello, world!"
val msg2: java.lang.String = "Hello again, world"
val msg3: String = "Hello yet again, world"
println(msg)

// Can't reassign an immutable
//msg = "Goodbye cruel world!"

// Can reassign mutables
var greeting = "Hello, world!"
greeting = "Leave me alone, world!"

val multiLine =
  "This is the next line"

def max(x: Int, y: Int): Int = {
  if (x > y) x else y
}
max(3,5)

def greet() = println(msg)

