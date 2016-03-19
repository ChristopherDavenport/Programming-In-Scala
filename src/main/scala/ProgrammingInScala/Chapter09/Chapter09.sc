import java.io.{File, PrintWriter}





def withPrintWriter(file: File)( op: PrintWriter => Unit): Unit ={
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}
// New Version
val file = new File("date.txt")
withPrintWriter(file){
  writer => writer.println(new java.util.Date)
}


//Old Version
//withPrintWriter(
// new File("date.txt"),
// writer => writer.println(new java.util.Date)
// )

def containsNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num < 0)
      exists = true
  exists
}

def newContainsNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)

def containsOdd(nums: List[Int]) = nums.exists(_ % 2 ==1)

// Currying

def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1,2)

def curriedSum(x:Int)(y: Int) = x + y
curriedSum(1)(2)

def first(x: Int) = (y: Int ) => x + y
val second = first(1)
second(2)

val onePlus = curriedSum(1)_
onePlus(2)

val twoPlus = curriedSum(2)_
twoPlus(2)

def twice(op: Double => Double, x: Double) = op(op(x))

twice(_ * 2, 5)

var assertionsEnabled = true

def myAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate)
    throw new AssertionError()

myAssert(5 > 3)