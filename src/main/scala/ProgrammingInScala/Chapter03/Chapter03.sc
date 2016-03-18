import java.math.BigInteger

/**
  * Chapter 03
  * Next Steps in Scala
  */

val big = new BigInteger("12345")
val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2) println(greetStrings(i))

val numNames = Array("zero", "one", "two")

val oneTwoThree = List(1,2,3)

val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour
println( oneTwo + " and " + threeFour +" were not mutated.")
println("Thus, "+ oneTwoThreeFour + " is a new list.")

val pair = (99, "Luftballoons")
println(pair._1)
println(pair._2)


// Why we go Functional

def printArgsImperative(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length){
    println(args(i))
    i += 1
  }
}

def printArgsFor(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

// SIDE EFFECT BLASPHEMY
def printArgsFunctions(args: Array[String]): Unit = {
  args.foreach(println(_))
}

def formatArgs(args: Array[String]) = args.mkString("\n")

var args = Array("Monkey", "King")
println(formatArgs(args))

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")